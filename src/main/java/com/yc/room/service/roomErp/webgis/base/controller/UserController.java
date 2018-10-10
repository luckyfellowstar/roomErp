package com.yc.room.service.roomErp.webgis.base.controller;

import com.yc.room.service.roomErp.webgis.base.model.BaseUser;
import com.yc.room.service.roomErp.webgis.base.service.UserService;
import com.yc.room.service.utils.result.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * user测试类
 * xing.yang
 */
@Controller
@RequestMapping("/test123")
public class UserController {

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);


    @Autowired
    UserService userService;

    @RequestMapping(value = "/query")
    @ResponseBody
    public Result instructionAdd() {

        try {
            logger.info("查询");

            List<BaseUser> all = userService.findAll();

            return new Result<>(all);

        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            return new Result(1, "保存出错");

        }

    }


}
