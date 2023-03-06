package com.paquetecontable.main.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.paquetecontable.main.Models.AuditoriaServicios.Auditoria;

public interface CRUDAuditoriaServicios extends MongoRepository<Auditoria, String>{
    
    @Query
    Auditoria findByCorrelationId(String id);

}
