package com.yc.room.service.roomErp.webgis.base.service.impl;


import com.yc.room.service.roomErp.webgis.base.dao.UserDao;
import com.yc.room.service.roomErp.webgis.base.model.BaseUser;
import com.yc.room.service.roomErp.webgis.base.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 */
@Service
public class UserServiceImpl implements UserService {

    static Logger log = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    UserDao userDao;


    @Override
    public List<BaseUser> findAll() {
        return userDao.findAll();
    }

    @Override
    public BaseUser findOneByName(String name) {
        return userDao.findBaseUserByName(name);
    }

}
