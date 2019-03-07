package com.betancur;

import java.util.Date;

public class Inscripcion{
     private Long id;
     private Aspirante aspirante;
     private Competencia competencia;
     private Boolean estadoInscripcion;
     private Date fechaInscripcion;
     
    public Inscripcion() {
    }

	
    public Inscripcion(Aspirante aspirante, Competencia competencia) {
        this.aspirante = aspirante;
        this.competencia = competencia;
    }
    public Inscripcion(Aspirante aspirante, Competencia competencia, Boolean estadoInscripcion, Date fechaInscripcion) {
       this.aspirante = aspirante;
       this.competencia = competencia;
       this.estadoInscripcion = estadoInscripcion;
       this.fechaInscripcion = fechaInscripcion;
    }
   
    public Long getId() {
        return this.id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    public Aspirante getAspirante() {
        return this.aspirante;
    }
    
    public void setAspirante(Aspirante aspirante) {
        this.aspirante = aspirante;
    }
    public Competencia getCompetencia() {
        return this.competencia;
    }
    
    public void setCompetencia(Competencia competencia) {
        this.competencia = competencia;
    }
    public Boolean getEstadoInscripcion() {
        return this.estadoInscripcion;
    }
    
    public void setEstadoInscripcion(Boolean estadoInscripcion) {
        this.estadoInscripcion = estadoInscripcion;
    }
    public Date getFechaInscripcion() {
        return this.fechaInscripcion;
    }
    
    public void setFechaInscripcion(Date fechaInscripcion) {
        this.fechaInscripcion = fechaInscripcion;
    }
    
}


