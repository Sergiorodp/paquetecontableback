package com.paquetecontable.main.Models.AuditoriaServicios;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("PC_AUDITORIA_SERVICIOS")
public class Auditoria {

    @Id
    private String id;

    private String datosEntrada;
    private String operacion;
    private String datosSalida;
    private String funcion;
    private String estado;
}
