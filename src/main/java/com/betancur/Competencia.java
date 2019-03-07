package com.betancur;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Competencia{
     private Long id;
     private Categoria categoria;
     private Disciplina disciplina;
     private Date fechaCompetencia;
     private Date horaCompetencia;
     private List<Competidor> competidores;
     private List<Inscripcion> inscripciones;

    public Competencia() {
        this.competidores = new ArrayList<>();
        this.inscripciones = new ArrayList<>();
    }

	
    public Competencia(Categoria categoria, Disciplina disciplina) {
        this.categoria = categoria;
        this.disciplina = disciplina;
        this.competidores = new ArrayList<>();
        this.inscripciones = new ArrayList<>();
    }
    public Competencia(Categoria categoria, Disciplina disciplina, Date fechaCompetencia, Date horaCompetencia) {
       this.categoria = categoria;
       this.disciplina = disciplina;
       this.fechaCompetencia = fechaCompetencia;
       this.horaCompetencia = horaCompetencia;
       this.competidores = new ArrayList<>();
       this.inscripciones = new ArrayList<>();
    }
   
    public Long getId() {
        return this.id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    public Categoria getCategoria() {
        return this.categoria;
    }
    
    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    public Disciplina getDisciplina() {
        return this.disciplina;
    }
    
    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }
    public Date getFechaCompetencia() {
        return this.fechaCompetencia;
    }
    
    public void setFechaCompetencia(Date fechaCompetencia) {
        this.fechaCompetencia = fechaCompetencia;
    }
    public Date getHoraCompetencia() {
        return this.horaCompetencia;
    }
    
    public void setHoraCompetencia(Date horaCompetencia) {
        this.horaCompetencia = horaCompetencia;
    }

    public List<Competidor> getCompetidores() {
        return competidores;
    }

    public void setCompetidores(List<Competidor> competidores) {
        this.competidores = competidores;
    }

    public List<Inscripcion> getInscripciones() {
        return inscripciones;
    }

    public void setInscripciones(List<Inscripcion> inscripciones) {
        this.inscripciones = inscripciones;
    }
    
    


}


