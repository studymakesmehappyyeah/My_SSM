package com.hdu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ZWH
 * @Description
 * @date 2021/1/23 14:26
 */
@Controller
public class MyController {

    @RequestMapping("/firCon")
    public String firCon(){

        System.out.println("yes");
        return "customer";
    }
}
