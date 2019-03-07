package com.betancur;

import java.util.Calendar;
import java.util.Date;

public class Aspirante{
     private Long id;
     private Categoria categoria;
     private Escuela escuela;
     private String apellido;
     private String direccion;
     private Date fechaDeNacimiento;
     private String nombres;
     private Boolean sexo;
     private String dni;

    public Aspirante() {
    }
	
    public Aspirante(Categoria categoria, Escuela escuela) {
        this.categoria = categoria;
        this.escuela = escuela;
    }
    public Aspirante(Categoria categoria, Escuela escuela, String apellido, String direccion, Date fechaDeNacimiento, String nombres, Boolean sexo) {
       this.categoria = categoria;
       this.escuela = escuela;
       this.apellido = apellido;
       this.direccion = direccion;
       this.fechaDeNacimiento = fechaDeNacimiento;
       this.nombres = nombres;
       this.sexo = sexo;
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
    public Escuela getEscuela() {
        return this.escuela;
    }
    
    public void setEscuela(Escuela escuela) {
        this.escuela = escuela;
    }
    public String getApellido() {
        return this.apellido;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public Date getFechaDeNacimiento() {
        return this.fechaDeNacimiento;
    }
    
    public void setFechaDeNacimiento(Date fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }
    public String getNombres() {
        return this.nombres;
    }
    
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    public Boolean getSexo() {
        return this.sexo;
    }
    
    public void setSexo(Boolean sexo) {
        this.sexo = sexo;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
        
    /**
     * calcularEdad
     * Calcula la edad en funcion a la fechaDenacimiento ingresada
     * @param fechaDeNacimiento
     * @return 
     */
    public int calcularEdad(Date fechaDeNacimiento) {
        Calendar calendario = Calendar.getInstance(); // fecha actual
        int anioDeHoy = calendario.get(Calendar.YEAR);
        int mesDeHoy = calendario.get(Calendar.MONTH);
        int diaDeHoy = calendario.get(Calendar.DAY_OF_MONTH);
        
        calendario.setTime(fechaDeNacimiento); // fecha de nacimiento
        int anioDeNacimiento = anioDeHoy - calendario.get(Calendar.YEAR)-1;
        int mesDeNacimiento = calendario.get(Calendar.MONTH);
        
        
        if (mesDeNacimiento == mesDeHoy) { // Mismo mes
            return calendario.get(Calendar.DAY_OF_MONTH) <= diaDeHoy ? anioDeNacimiento
                    : anioDeNacimiento - 1;
        } else {
            return mesDeNacimiento < mesDeHoy ? anioDeNacimiento - 1 : anioDeNacimiento;
        }
    }
}


