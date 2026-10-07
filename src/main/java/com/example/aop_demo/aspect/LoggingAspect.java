package com.example.aop_demo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* com.example.aop_demo.service.UserService.*(..))")
    public void logBefore(JoinPoint joinPoint) {
        System.out.println("[BEFORE] Calling: " + joinPoint.getSignature().getName()
                + " with args: " + Arrays.toString(joinPoint.getArgs()));
    }

    @After("execution(* com.example.aop_demo.service.UserService.*(..))")
    public void logAfter(JoinPoint joinPoint) {
        System.out.println("[AFTER] Finished: " + joinPoint.getSignature().getName());
    }
}
