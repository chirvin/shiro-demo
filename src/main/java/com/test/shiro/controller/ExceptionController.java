package com.test.shiro.controller;

import com.test.shiro.model.ResultMap;
import org.apache.shiro.authc.AccountException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionController {

    /**
     * 捕捉 CustomRealm 抛出的异常
     */
    @ExceptionHandler(AccountException.class)
    public ResultMap handleShiroException(Exception ex) {
        ResultMap resultMap = new ResultMap();
        return resultMap.fail().message(ex.getMessage());
    }
}
