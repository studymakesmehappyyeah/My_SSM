package com.hdu.service;

import com.hdu.po.User;

/**
 * @author ZWH
 * @Description
 * @date 2021/1/23 15:59
 */
public interface UserService {
    public User login(String username, String password);

    public Integer register(User user);


    public void transfer(String outUser,String inUser,double money);

    public Integer delete(String username,String password);
}
