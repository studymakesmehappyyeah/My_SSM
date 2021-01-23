package com.hdu.test;

import com.hdu.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ZWH
 * @Description
 * @date 2021/1/23 18:48
 */
public class HowTohtml {
    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");

        UserService userService = (UserService)app.getBean("userServiceImpl");
        userService.transfer("zwh","heeh",50.0);
        System.out.println("gogogo");
    }
}
