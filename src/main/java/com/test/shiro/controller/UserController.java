package com.test.shiro.controller;

import com.test.shiro.model.ResultMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping(value = "/getMessage", method = RequestMethod.GET)
    public ResultMap getMessage() {
        ResultMap resultMap = new ResultMap();
        return resultMap.success().message("您拥有用户权限，可以获得该接口的信息！");
    }
}
