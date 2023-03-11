package com.paquetecontable.main.client;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.paquetecontable.main.Models.Client.PUC.PUCClientModel;


@Service
public class PUCServiceCLient {

    @Autowired
    private RestTemplate client;

    private String uri = "https://dianhoy.com/wp-content/uploads/2022/03/puc2020.json";

    public List<PUCClientModel> getCodesServiceCLient(){
        
        PUCClientModel[] Response = client.getForObject(uri, PUCClientModel[].class);
        return Arrays.asList(Response);
    }
    
}
