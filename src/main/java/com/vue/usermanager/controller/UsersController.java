package com.vue.usermanager.controller;

import com.vue.usermanager.bean.Users;
import com.vue.usermanager.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/users")
@RestController
public class UsersController {
    @Autowired
    private UsersService usersService;

    @RequestMapping(method = RequestMethod.GET,value = "/userList")
    public @ResponseBody List<Users> queryUsersList(){
        return usersService.queryUsers();
    }

    @RequestMapping(method = RequestMethod.DELETE,value = "/deleteUsers")
    public void deleteUserById(@RequestParam("id") int id){
        usersService.deleteUsersById(id);
    }

    @RequestMapping(method = RequestMethod.POST,value = "editUsers")
    public void editUsersById(@RequestBody Users users){
        usersService.editUsersById(users);
    }

    @RequestMapping(method = RequestMethod.GET,value = "userInfoById")
    public @ResponseBody Users queryUserInfoById(@RequestParam("id") int id){
        return usersService.queryUsersById(id);
    }

    @RequestMapping(method = RequestMethod.POST,value = "createUsers")
    public @ResponseBody Integer  createUsers(@RequestBody Users users){
        int a= usersService.createUsers(users);
        return a;
    }

//    @RequestMapping(method = RequestMethod.POST,value = "/login")
//    public @ResponseBody Users Login

}
