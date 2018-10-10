package com.yc.room.service.roomErp.webgis.base.controller;

import com.yc.room.service.roomErp.webgis.base.model.WeixinUser;
import com.yc.room.service.utils.result.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: roomErp
 * @description: 微信登录接口
 * @author: xing.yang
 * @create: 2018-09-18 16:06
 **/

@RestController
@RequestMapping("/v1/login")
public class LoginController {

    private static final Logger logger = LoggerFactory.getLogger(LoginController.class);


    @PostMapping(value = "/binding")
    public ResponseEntity<Result> binding(WeixinUser weixinUser) {

        try {
           //messageService.sendMessage(message);


            return ResponseEntity.status(HttpStatus.CREATED).body(new Result(0, "绑定成功"));

        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        }
        // 如果服务器出错，返回500
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(new Result(1, "绑定出错"));

    }

}
