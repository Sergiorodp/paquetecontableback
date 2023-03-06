package com.paquetecontable.main.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import com.paquetecontable.main.Models.Client.PUC.PUCClientModel;
import com.paquetecontable.main.bussines.PUCBussines;

@Controller
public class PUCController {
    
    @Autowired
    private PUCBussines pucBussines;

    @QueryMapping(name = "getCodes")
    public List<PUCClientModel> getCodesController(){
        return pucBussines.getCodesBussines();
    }
    
}
