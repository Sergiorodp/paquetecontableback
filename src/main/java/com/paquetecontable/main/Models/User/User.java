package com.paquetecontable.main.Models.User;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("user")
public class User {

    @Id
    private String id;
    
    private String name;
    private String category;

    public User(String id, String name, String category){
        this.id = id;
        this.category = category;
        this.name = name;
    }
}
