package com.paquetecontable.main.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.paquetecontable.main.Models.User.User;
import com.paquetecontable.main.bussines.UserBussines;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {

    @Autowired
    private UserBussines bussines;

    @GetMapping(value = "/create")
    @ResponseBody
    public User createUserController(){
        return bussines.createUserService();
    }

    @GetMapping(value = "/getAll")
    public List<User> getAllController(){
        return bussines.getAllService();
    }
}
