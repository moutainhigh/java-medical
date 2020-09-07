package com.vpu.mp.dao.shop.address;

import com.vpu.mp.dao.foundation.base.ShopBaseDao;
import com.vpu.mp.service.pojo.shop.member.address.UserAddressVo;
import org.springframework.stereotype.Repository;

import static com.vpu.mp.db.shop.Tables.USER_ADDRESS;

/**
 * @author 赵晓东
 * @description
 * @create 2020-09-07 10:00
 **/
@Repository
public class UserAddressDao extends ShopBaseDao {

    /**
     * 根据地址id查询地址详情
     * @param addressId 地址id
     * @return UserAddressVo
     */
    public UserAddressVo getUserAddressInfoByAddressId(Integer addressId) {
        return db().select().from(USER_ADDRESS)
            .where(USER_ADDRESS.ADDRESS_ID.eq(addressId)).fetchAnyInto(UserAddressVo.class);
    }

}
