package com.ms.demo.core;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR) // 返回500状态
    public R<String> handleException(Exception e) {
        // 可以记录日志或执行其他处理
        return new R<>(1, "发生异常: " + e.getMessage(), 0, null);
    }
}
