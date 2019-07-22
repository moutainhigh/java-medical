package com.vpu.mp.service.foundation.database;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import lombok.Data;

@Service
@Data
public class DatasourceManager {

	@Value(value = "${db.host}")
	protected String host;

	@Value(value = "${db.port}")
	protected Integer port;

	@Value(value = "${db.database}")
	protected String database;

	@Value(value = "${db.username}")
	protected String username;

	@Value(value = "${db.password}")
	protected String password;

	@Value(value = "${db.prefix}")
	protected String dbPrefix;

	@Value(value = "${db.shop.host}")
	protected String shopHost;

	@Value(value = "${db.shop.port}")
	protected Integer shopPort;

	@Value(value = "${db.shop.username}")
	protected String shopUsername;

	@Value(value = "${db.shop.password}")
	protected String shopPassword;

	@Value(value = "${db.shop.prefix}")
	protected String shopDbPrefix;

	protected String driver = "com.mysql.cj.jdbc.Driver";
	protected String dialect = "MYSQL";

	/**
	 * 数据源列表，多线程共用。
	 */
	protected Map<String, BasicDataSource> datasources = Collections
			.synchronizedMap(new HashMap<String, BasicDataSource>());

	/**
	 * 得到主库数据源
	 */
	public BasicDataSource getMainDbDatasource() {
		return this.getDatasource(this.host, this.port, this.username, this.password);
	}

	/**
	 * 得到店铺库数据源
	 */
	public BasicDataSource getShopDbDatasource(String host, Integer port, String username, String password) {
		return this.getDatasource(host, port, username, password);
	}

	/**
	 * 得到即将创建店铺库的数据源
	 */
	public BasicDataSource getToCreateShopDbDatasource() {
		return this.getDatasource(this.shopHost, this.shopPort, this.shopUsername, this.shopPassword);
	}

	/**
	 * 得到数据源
	 */
	protected BasicDataSource getDatasource(String host, Integer port, String username, String password) {
		String key = String.format("%s:port_%s_%s", host, port, username, password);
		if (!datasources.containsKey(key)) {
			datasources.put(key, dataSource(getJdbcUrl(host, port, ""), username, password));
		}
		return datasources.get(key);
	}

	

	/**
	 * 得到配置好的数据源
	 * 
	 * @param url
	 * @param username
	 * @param password
	 * @param driver
	 * @return
	 */
	protected BasicDataSource dataSource(String url, String username, String password) {
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setUrl(url);
		dataSource.setUsername(username);
		dataSource.setPassword(password);
		dataSource.setDriverClassName(driver);
		// TODO：设置数据源其他参数，可以在配置里读取
		return dataSource;
	}
	
	/**
	 * 得到JDBC串
	 * 
	 * @param host
	 * @param port
	 * @param database
	 * @return
	 */
	public String getJdbcUrl(String host, Integer port, String database) {
		return "jdbc:mysql://" + host + ":" + port + "/" + database
				+ "?serverTimezone=Hongkong&useSSL=false&useUnicode=true&characterEncoding=UTF-8";
	}
	
	/**
	 * 得到安装数据库配置
	 * @param shopId
	 * @return
	 */
	public DbConfig getInstallShopDbConfig(Integer shopId) {
		DbConfig dbConfig = new DbConfig();
		dbConfig.host = shopHost;
		dbConfig.database = shopDbPrefix + shopId.toString();
		dbConfig.username = shopUsername;
		dbConfig.password = shopPassword;
		return dbConfig;
	}
}
