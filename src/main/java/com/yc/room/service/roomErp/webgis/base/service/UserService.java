package com.yc.room.service.roomErp.webgis.base.service;


import com.yc.room.service.roomErp.webgis.base.model.BaseUser;

import java.util.List;


/**
 * 用户管理
 */
public interface UserService {


    List<BaseUser> findAll();

    BaseUser findOneByName(String name);


}
