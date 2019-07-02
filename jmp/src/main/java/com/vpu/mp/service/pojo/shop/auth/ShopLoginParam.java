package com.vpu.mp.service.pojo.shop.auth;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 
 * @author 新国
 *
 */
@Data
@NoArgsConstructor
public class ShopLoginParam {
	public String username;
	public String subUsername;
	public String password;
	public Boolean isSubLogin;
}
