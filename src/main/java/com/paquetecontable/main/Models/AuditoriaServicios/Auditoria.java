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

    public String getId() {
        return id;
    }
    public String getDatosEntrada() {
        return datosEntrada;
    }
    public void setDatosEntrada(String datosEntrada) {
        this.datosEntrada = datosEntrada;
    }
    public String getOperacion() {
        return operacion;
    }
    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }
    public String getDatosSalida() {
        return datosSalida;
    }
    public void setDatosSalida(String datosSalida) {
        this.datosSalida = datosSalida;
    }
    public String getFuncion() {
        return funcion;
    }
    public void setFuncion(String funcion) {
        this.funcion = funcion;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
}
