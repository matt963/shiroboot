package com.vue.usermanager.service;

import com.vue.usermanager.bean.Users;
import com.vue.usermanager.dao.UsersDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersService {
    @Autowired
    private UsersDao usersDao;

    public List<Users> queryUsers(){
        return usersDao.queryUsers();
    }

    public Integer deleteUsersById(int id){
        return usersDao.deleteUsersById(id);
    }

    public Integer editUsersById(Users users){
        return usersDao.updateUsersByid(users);
    }

    public Users queryUsersById(int id){
        return usersDao.queryUsersByid(id);
    }

    public Integer createUsers(Users users){
        return usersDao.createUsers(users);
    }

    public  Users queryUserInfoByPassword(String userName,String password){
        return usersDao.queryUserInfoByPassWord(userName,password);
    }
}
