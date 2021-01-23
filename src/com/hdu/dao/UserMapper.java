package com.hdu.dao;

import com.hdu.po.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author ZWH
 * @Description
 * @date 2021/1/23 15:52
 */
public interface UserMapper {

    public User findUserById(Integer id);

    public User login(@Param("username") String username, @Param("password") String password);

    public Integer register(User user) ;

    public Integer addMoney(@Param("outUser") String outUser,@Param("money") double money);

    public Integer subMoney(@Param("inUser")String inUser,@Param("money")double money);

    public Integer delete(@Param("username")String username,@Param("password") String password);
}
