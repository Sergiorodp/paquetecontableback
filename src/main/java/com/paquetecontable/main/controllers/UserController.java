package com.paquetecontable.main.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import com.paquetecontable.main.Models.Client.PUC.PUCClientModel;
import com.paquetecontable.main.Models.User.User;
import com.paquetecontable.main.bussines.UserBussines;

@Controller
public class UserController {

    @Autowired
    private UserBussines bussines;

    @QueryMapping
    public User createUserController(){
        return bussines.createUserService();
    }

    @QueryMapping(name = "getUsers")
    public List<User> getUsersController(){
        return bussines.getAllService();
    }

    @QueryMapping
    public List<PUCClientModel> getCodesController(){
        return bussines.getCodesBussines();
    }
}
