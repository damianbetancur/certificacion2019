/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.betancur.controller;

import com.betancur.Aspirante;
import com.betancur.Categoria;
import com.betancur.Disciplina;
import com.betancur.Escuela;
import com.betancur.dao.CategoriaDao;
import com.betancur.dao.hibernateImpl.CategoriaDaoHibernateImpl;
import com.betancur.dao.DisciplinaDao;
import com.betancur.dao.hibernateImpl.DisciplinaDaoHibernateImpl;
import com.betancur.dao.EscuelaDao;
import com.betancur.dao.hibernateImpl.EscuelaDaoHibernateImpl;
import com.betancur.view.UIRegistrarAspirante;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.SessionFactory;

/**
 *
 * @author Ariel
 */
public class GestorDeInscripcion {
    private final SessionFactory sessionFactory;
    
    private final EscuelaDao escuelaDao;
    private final CategoriaDao categoriaDao;
    private final DisciplinaDao disciplinaDao;
    
    private Escuela escuelaEncontrada;
    
    public GestorDeInscripcion(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
        
        this.escuelaDao = new EscuelaDaoHibernateImpl(sessionFactory);
        this.categoriaDao = new CategoriaDaoHibernateImpl(sessionFactory);
        this.disciplinaDao = new DisciplinaDaoHibernateImpl(sessionFactory);
        
    }
    
    
    
    public void run () {
        new UIRegistrarAspirante(this).setVisible(true);
    }
    
    public List<Escuela> listarEscuelas () {
        return escuelaDao.listarEscuelas();
    }

    public Escuela getEscuelaEncontrada() {
        return escuelaEncontrada;
    }

    public void setEscuelaEncontrada(Escuela escuelaEncontrada) {
        this.escuelaEncontrada = escuelaEncontrada;
    }
    
    public List <Categoria> listarCategorias(){
        return categoriaDao.listarCategorias();
    }
    
    public void asignarCategoria(Aspirante aspirante){
        int edadAspirante = aspirante.calcularEdad(aspirante.getFechaDeNacimiento());
        
        if (aspirante.getSexo()) {//Mujer
            if ( (edadAspirante >= 6 ) && (edadAspirante <= 11)) {//Infantil
                aspirante.setCategoria(categoriaDao.buscarPorNombre("Infantiles Mujeres"));
            }else{//Menor
                aspirante.setCategoria(categoriaDao.buscarPorNombre("Menores Mujeres"));
            }
        }else{//Varon
            if ( (edadAspirante >= 6 ) && (edadAspirante <= 11)) {//Infantil
                aspirante.setCategoria(categoriaDao.buscarPorNombre("Infantiles Varones"));
            }else{//Menor
                aspirante.setCategoria(categoriaDao.buscarPorNombre("Menores Varones"));
            }
        }
        
    }
    
    public List <Disciplina> listarDisciplinas(){
        return disciplinaDao.listarDisciplinas();
    }
    
    public List <Disciplina> disciplinasPorDefecto(){
        List<Disciplina> retorno = new ArrayList<>();
        retorno.add(disciplinaDao.buscarPorNombre("100 metros llanos"));
        retorno.add(disciplinaDao.buscarPorNombre("50 metros con vallas"));
        
        return retorno;
    }
    
}
