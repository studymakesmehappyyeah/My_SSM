package com.hdu.controller;

import com.hdu.po.User;
import com.hdu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

/**
 * @author ZWH
 * @Description
 * @date 2021/1/23 14:26
 */
@Controller
public class MyController {
    @Autowired
    private UserService userService;

    @RequestMapping("/firCon")
    public String firCon(){

        System.out.println("yes");
        return "customer";
    }


    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(String username, String password, HttpSession httpSession, Model model){
        User user = this.userService.login(username,password);
        if (user!=null){
            httpSession.setAttribute("USER_SESSION",user);
            return "ok";
        }
        model.addAttribute("msg","登录失败");
        return "login";
    }

    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public String register(User user, Model model){
        int row = this.userService.register(user);
        if (row>0){
            model.addAttribute("msg","注册成功");
            return "login";
        }
        model.addAttribute("msg","登录失败");
        return "login";
    }


    @RequestMapping("/fakeLogin")
    public String fakeLogin(){
        return "ok";
    }

    @RequestMapping("/delete")
    public String delete(User user,Model model){
        String username = user.getUsername();
        String password = user.getPassword();
        int row = this.userService.delete(username,password);
        if (row>0){
            model.addAttribute("msg","删除成功");
            return "login";
        }
        model.addAttribute("msg","删除失败");
        return "login";
    }
}
