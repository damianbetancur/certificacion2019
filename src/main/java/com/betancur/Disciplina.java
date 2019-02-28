package com.betancur;

import java.util.ArrayList;
import java.util.List;

public class Disciplina  implements java.io.Serializable {
     private Long id;
     private Torneo torneo;
     private String nombre;
     private List<Competencia> competencias;

    public Disciplina() {
    }

	
    public Disciplina(Torneo torneo) {
        this.competencias = new ArrayList<>();
        this.torneo = torneo;
    }
    public Disciplina(Torneo torneo, String nombre) {
       this.torneo = torneo;
       this.nombre = nombre;
       this.competencias = new ArrayList<>();
    }
   
    public Long getId() {
        return this.id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    public Torneo getTorneo() {
        return this.torneo;
    }
    
    public void setTorneo(Torneo torneo) {
        this.torneo = torneo;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Competencia> getCompetencias() {
        return competencias;
    }

    public void setCompetencias(List<Competencia> competencias) {
        this.competencias = competencias;
    }
   
    

}


