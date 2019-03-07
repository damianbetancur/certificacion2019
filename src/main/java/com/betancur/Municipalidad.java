package com.betancur;

import java.util.ArrayList;
import java.util.List;


public class Municipalidad{
     private Long id;
     private String direccion;
     private String nombre;
     private List<Zona> zonas;
     private List<Torneo> torneos;

    public Municipalidad() {
       this.zonas = new ArrayList<>();
       this.torneos = new ArrayList<>();
    }

    public Municipalidad(String direccion, String nombre) {
       this.direccion = direccion;
       this.nombre = nombre;
       this.zonas = new ArrayList<>();
       this.torneos = new ArrayList<>();
    }
   
    public Long getId() {
        return this.id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Zona> getZonas() {
        return zonas;
    }

    public void setZonas(List<Zona> zonas) {
        this.zonas = zonas;
    }

    public List<Torneo> getTorneos() {
        return torneos;
    }

    public void setTorneos(List<Torneo> torneos) {
        this.torneos = torneos;
    }
    
}


