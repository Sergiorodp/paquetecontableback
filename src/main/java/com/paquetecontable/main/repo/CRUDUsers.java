package com.paquetecontable.main.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.paquetecontable.main.Models.User.User;

public interface CRUDUsers extends MongoRepository<User, String>{
    
}
