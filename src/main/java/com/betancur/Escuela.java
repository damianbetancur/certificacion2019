package com.betancur;

public class Escuela{
     private Long id;
     private Zona zona;
     private String barrio;
     private String cue;
     private String direccion;
     private String nivel;
     private String nombre;
     private String telefono;

    public Escuela() {
    }

	
    public Escuela(Zona zona) {
        this.zona = zona;
    }
    public Escuela(Zona zona, String barrio, String cue, String direccion, String nivel, String nombre, String telefono) {
       this.zona = zona;
       this.barrio = barrio;
       this.cue = cue;
       this.direccion = direccion;
       this.nivel = nivel;
       this.nombre = nombre;
       this.telefono = telefono;
    }
   
    public Long getId() {
        return this.id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    public Zona getZona() {
        return this.zona;
    }
    
    public void setZona(Zona zona) {
        this.zona = zona;
    }
    public String getBarrio() {
        return this.barrio;
    }
    
    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }
    public String getCue() {
        return this.cue;
    }
    
    public void setCue(String cue) {
        this.cue = cue;
    }
    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getNivel() {
        return this.nivel;
    }
    
    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
   
}


