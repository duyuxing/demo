package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/insertUser")
    public int insertUser() throws Exception{
        User user = new User();
        user.setName("杜雨兴");
        user.setUser("1qazXSW@");
        Integer primaryId = userService.insertUser(user);
        System.out.println("================"+user.getId());   //获取自增主键
        return primaryId;
    }

    @PostMapping("/findUserByName")
    public List<User> findUserByName(){
        return userService.findUserByName("");
    }

    @PostMapping("/deleteUser")
    public void deleteUser(){
        userService.deleteUser(null);
    }
}
