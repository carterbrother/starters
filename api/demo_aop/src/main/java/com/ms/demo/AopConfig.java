package com.ms.demo;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@EnableAspectJAutoProxy
@Aspect
@Component
@Slf4j
public class AopConfig {

    // 切点匹配业务包下的所有 public 方法
    @Around("execution(public * com.ms.demo..*.*(..))") // 修改为你的包路径
    public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        long startTime = System.currentTimeMillis();

        Object proceed = joinPoint.proceed(); // 执行方法

        long executionTime = System.currentTimeMillis() - startTime;

        log.info("Method {} executed in {} ms", joinPoint.getSignature(), executionTime);
        return proceed;
    }

}
