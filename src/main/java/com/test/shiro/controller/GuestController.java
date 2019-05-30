package com.test.shiro.controller;

import com.test.shiro.model.ResultMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/guest")
public class GuestController {

    @RequestMapping(value = "/enter", method = RequestMethod.GET)
    public ResultMap login() {
        ResultMap resultMap = new ResultMap();
        return resultMap.success().message("欢迎进入，您的身份是游客");
    }

    @RequestMapping(value = "/getMessage", method = RequestMethod.GET)
    public ResultMap submitLogin() {
        ResultMap resultMap = new ResultMap();
        return resultMap.success().message("您拥有获得该接口的信息的权限！");
    }
}
