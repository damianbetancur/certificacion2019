package com.betancur;

import java.util.ArrayList;
import java.util.List;

public class Zona  implements java.io.Serializable {
     private Long id;
     private Municipalidad municipalidad;
     private String nombre;
     private List<Escuela> escuelas;

    public Zona() {
        this.escuelas = new ArrayList<>();
    }

	
    public Zona(Municipalidad municipalidad) {
        this.municipalidad = municipalidad;
    }
    public Zona(Municipalidad municipalidad, String nombre) {
       this.municipalidad = municipalidad;
       this.nombre = nombre;
       this.escuelas = new ArrayList<>();
    }
   
    public Long getId() {
        return this.id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    public Municipalidad getMunicipalidad() {
        return this.municipalidad;
    }
    
    public void setMunicipalidad(Municipalidad municipalidad) {
        this.municipalidad = municipalidad;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Escuela> getEscuelas() {
        return escuelas;
    }

    public void setEscuelas(List<Escuela> escuelas) {
        this.escuelas = escuelas;
    }    
}


