package com.yc.room.service.roomErp.webgis.base.dao;


import com.yc.room.service.roomErp.webgis.base.model.BaseUser;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;

/**
 * userDao
 */

public interface UserDao extends JpaRepository<BaseUser, Integer> {

    List<BaseUser> findAll();

    BaseUser findBaseUserByName(String name);

}
