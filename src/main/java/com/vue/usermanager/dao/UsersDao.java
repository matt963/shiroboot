package com.vue.usermanager.dao;

import com.vue.usermanager.bean.Users;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface UsersDao {
    @Select("select id,username,password,email,sex,birthday from users")
     List<Users> queryUsers();

    @Select("select id,username,password,email,sex,birthday from users where id=#{id}")
    Users queryUsersByid(@Param("id") int id);

    @Insert("insert into users(username,password,email,sex,birthday)values(#{userName},#{password},#{email},#{sex},#{birthday})")
    @Options(useGeneratedKeys = true,keyProperty = "id",keyColumn = "id")
     Integer createUsers(Users users);

    @Delete("delete from users where id=#{id}")
    int deleteUsersById(@Param("id") int id);

    @Update("update users set username=#{userName},email=#{email},sex=#{sex},birthday=#{birthday} where id=#{id}")
    Integer updateUsersByid(Users users);

    //用户登录功能
    @Select("select id,username,password,email,sex,birthday from users where username=#{userName} and password=#{password}")
    Users queryUserInfoByPassWord(@Param("userName") String userName,@Param("password") String password);
}
