package com.betancur;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Torneo{
     private Long id;
     private Municipalidad municipalidad;
     private Date fechaTorneo;
     private String nombre;
     private List<Disciplina> disciplinas;

    public Torneo() {
        this.disciplinas = new ArrayList<>();
    }

	
    public Torneo(Municipalidad municipalidad) {
        this.municipalidad = municipalidad;
        this.disciplinas = new ArrayList<>();
    }
    public Torneo(Municipalidad municipalidad, Date fechaTorneo, String nombre) {
       this.municipalidad = municipalidad;
       this.fechaTorneo = fechaTorneo;
       this.nombre = nombre;
       this.disciplinas = new ArrayList<>();
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
    public Date getFechaTorneo() {
        return this.fechaTorneo;
    }
    
    public void setFechaTorneo(Date fechaTorneo) {
        this.fechaTorneo = fechaTorneo;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }
}


