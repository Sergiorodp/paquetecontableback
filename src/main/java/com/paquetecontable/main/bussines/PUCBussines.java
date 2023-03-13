package com.paquetecontable.main.bussines;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paquetecontable.main.Models.Client.PUC.PUCClientModel;
import com.paquetecontable.main.client.PUCServiceCLient;

@Service
public class PUCBussines {

    @Autowired
    private PUCServiceCLient pucClient;

    public List<PUCClientModel> getCodesBussines(){
        return pucClient.getCodesServiceCLient();
    }

}