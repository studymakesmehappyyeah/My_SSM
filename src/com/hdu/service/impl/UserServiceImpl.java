package com.hdu.service.impl;

import com.hdu.dao.UserMapper;
import com.hdu.po.User;
import com.hdu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author ZWH
 * @Description
 * @date 2021/1/23 15:59
 */
@Service("userServiceImpl")
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public User login(String username, String password) {
        return this.userMapper.login(username,password);
    }

    @Override
    public Integer register(User user) {
        return this.userMapper.register(user);
    }

    @Override
    public void transfer(String outUser, String inUser, double money) {
        this.userMapper.subMoney(inUser,money);
        int i=1/0;
        this.userMapper.addMoney(outUser,money);
    }

    @Override
    public Integer delete(String username, String password) {
        return this.userMapper.delete(username,password);
    }


}
