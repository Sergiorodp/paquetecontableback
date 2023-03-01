package com.paquetecontable.main.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.paquetecontable.main.Models.User.User;

public interface CRUDUsers extends MongoRepository<User, String>{
    
    @Query("{name:?0}")
    User findUserById(String id);
    
}
