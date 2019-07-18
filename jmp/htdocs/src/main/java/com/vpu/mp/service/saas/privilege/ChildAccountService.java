package com.vpu.mp.service.saas.privilege;

import static com.vpu.mp.db.main.tables.SystemChildAccount.SYSTEM_CHILD_ACCOUNT;
import static com.vpu.mp.db.main.tables.SystemRole.SYSTEM_ROLE;

import org.jooq.Record;
import org.jooq.Result;

import com.vpu.mp.db.main.tables.records.SystemChildAccountRecord;
import com.vpu.mp.service.foundation.BaseService;
import com.vpu.mp.service.foundation.Util;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * 
 * @author 新国
 *
 */
@Service
@Scope("prototype")
public class ChildAccountService extends BaseService {

	public SystemChildAccountRecord verify(String username, String password) {
		SystemChildAccountRecord user = db().selectFrom(SYSTEM_CHILD_ACCOUNT)
				.where(SYSTEM_CHILD_ACCOUNT.ACCOUNT_NAME.eq(username)).or(SYSTEM_CHILD_ACCOUNT.MOBILE.eq(username))
				.fetchAny();
		if (user != null) {
			if (user.getAccountPwd().equals(Util.md5(password))) {
				return user;
			}
		}

		// db().selectFrom(SYSTEM_CHILD_ACCOUNT).limit(0, 20).fetch();
		return null;
	}

	public SystemChildAccountRecord checkByIdAndNameOnChild(Integer accountId, String username, Integer sysId) {
		SystemChildAccountRecord user = db().selectFrom(SYSTEM_CHILD_ACCOUNT)
				.where(SYSTEM_CHILD_ACCOUNT.ACCOUNT_NAME.eq(username))
				.and(SYSTEM_CHILD_ACCOUNT.ACCOUNT_ID.eq(accountId)).and(SYSTEM_CHILD_ACCOUNT.SYSTEM_USER_ID.eq(sysId))
				.fetchAny();
		if (user != null) {
			return user;
		}
		return null;
	}

	public SystemChildAccountRecord getUserFromAccountName(String username) {
		return db().selectFrom(SYSTEM_CHILD_ACCOUNT)
				.where(SYSTEM_CHILD_ACCOUNT.ACCOUNT_NAME.eq(username))
				.fetchAny();
	}
	public SystemChildAccountRecord getUserFromAccountId(Integer accountId) {
		return db().selectFrom(SYSTEM_CHILD_ACCOUNT)
				.where(SYSTEM_CHILD_ACCOUNT.ACCOUNT_ID.eq(accountId))
				.fetchAny();
	}

	public SystemChildAccountRecord getUserFromMobile(String mobile) {
		return db().selectFrom(SYSTEM_CHILD_ACCOUNT)
				.where(SYSTEM_CHILD_ACCOUNT.MOBILE.eq(mobile))
				.fetchAny();
	}

	public Result<Record> getPageList(Integer pageNo, Integer pageRows) {
		return db().select().from(SYSTEM_CHILD_ACCOUNT)
				.join(SYSTEM_ROLE)
				.on(SYSTEM_CHILD_ACCOUNT.ROLE_ID.eq(SYSTEM_ROLE.ROLE_ID))
				.limit(pageNo * pageRows, pageRows).fetch();

	}
}
