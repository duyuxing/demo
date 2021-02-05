package com.example.demo.service;

import com.example.demo.entity.User;

import java.util.List;

public interface UserService {

    public int insertUser(User user) throws Exception;

    public List<User> findUserByName(String name);

    public  void deleteUser(Integer id);
}
