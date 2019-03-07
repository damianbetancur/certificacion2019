package com.betancur;

public class Competidor{
     private Long id;
     private Competencia competencia;
     private Inscripcion inscripcion;
     private Float resultado;

    public Competidor() {
    }

	
    public Competidor(Competencia competencia, Inscripcion inscripcion) {
        this.competencia = competencia;
        this.inscripcion = inscripcion;
    }
    public Competidor(Competencia competencia, Inscripcion inscripcion, Float resultado) {
       this.competencia = competencia;
       this.inscripcion = inscripcion;
       this.resultado = resultado;
    }
   
    public Long getId() {
        return this.id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    public Competencia getCompetencia() {
        return this.competencia;
    }
    
    public void setCompetencia(Competencia competencia) {
        this.competencia = competencia;
    }
    public Inscripcion getInscripcion() {
        return this.inscripcion;
    }
    
    public void setInscripcion(Inscripcion inscripcion) {
        this.inscripcion = inscripcion;
    }
    public Float getResultado() {
        return this.resultado;
    }
    
    public void setResultado(Float resultado) {
        this.resultado = resultado;
    }




}


