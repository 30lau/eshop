package com.lau.eshop.config.Exception;

import org.apache.shiro.authz.AuthorizationException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

//配置异常处理器
@ControllerAdvice
public class ShiroException {
    @ExceptionHandler
    public String ErrorHandler(AuthorizationException e) {
       return "fail";
    }
}
