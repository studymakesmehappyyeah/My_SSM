package com.hdu.aspectJ;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

/**
 * @author ZWH
 * @Description
 * @date 2021/1/23 18:26
 */
@Aspect
@Component
public class MyAspectJ {

    @Pointcut("execution(* com.hdu.service.UserService.*(..))")
    public void myPointCut(){};



    @Before("myPointCut()")
    public void beforePointCut(){

        System.out.println("测试AOP");
    }


    @AfterThrowing(value = "execution(* com.hdu.service.impl.UserServiceImpl.transfer(..))",throwing = "e")
    public void afterThrowing(JoinPoint j ,Throwable e){
        System.out.println("异常了！！！"+e);
    }
}
