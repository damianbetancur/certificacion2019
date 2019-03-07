package com.betancur;

public class Categoria{
     private Long id;
     private Integer edadDeFinalizacion;
     private Integer edadDeInicio;
     private String nombreCategoria;

    public Categoria() {
    }

    public Categoria(Integer edadDeFinalizacion, Integer edadDeInicio, String nombreCategoria) {
       this.edadDeFinalizacion = edadDeFinalizacion;
       this.edadDeInicio = edadDeInicio;
       this.nombreCategoria = nombreCategoria;
    }
   
    public Long getId() {
        return this.id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    public Integer getEdadDeFinalizacion() {
        return this.edadDeFinalizacion;
    }
    
    public void setEdadDeFinalizacion(Integer edadDeFinalizacion) {
        this.edadDeFinalizacion = edadDeFinalizacion;
    }
    public Integer getEdadDeInicio() {
        return this.edadDeInicio;
    }
    
    public void setEdadDeInicio(Integer edadDeInicio) {
        this.edadDeInicio = edadDeInicio;
    }
    public String getNombreCategoria() {
        return this.nombreCategoria;
    }
    
    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }
    
}


