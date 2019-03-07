/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.betancur.controller;

import com.betancur.Aspirante;
import com.betancur.Categoria;
import com.betancur.Competencia;
import com.betancur.Disciplina;
import com.betancur.Escuela;
import com.betancur.Torneo;
import com.betancur.dao.CategoriaDao;
import com.betancur.dao.CompetenciaDao;
import com.betancur.dao.hibernateImpl.CategoriaDaoHibernateImpl;
import com.betancur.dao.DisciplinaDao;
import com.betancur.dao.hibernateImpl.DisciplinaDaoHibernateImpl;
import com.betancur.dao.EscuelaDao;
import com.betancur.dao.TorneoDao;
import com.betancur.dao.hibernateImpl.CompetenciaDaoHibernateImpl;
import com.betancur.dao.hibernateImpl.EscuelaDaoHibernateImpl;
import com.betancur.dao.hibernateImpl.TorneoDaoHibernateImpl;
import com.betancur.view.UIRegistrarAspirante;
import com.betancur.vo.AspiranteVO;
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
    private final TorneoDao torneoDao;
    private final CompetenciaDao competenciaDao;
    
    private Escuela escuelaEncontrada;
    
    public GestorDeInscripcion(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
        
        this.escuelaDao = new EscuelaDaoHibernateImpl(sessionFactory);
        this.categoriaDao = new CategoriaDaoHibernateImpl(sessionFactory);
        this.disciplinaDao = new DisciplinaDaoHibernateImpl(sessionFactory);
        this.torneoDao = new TorneoDaoHibernateImpl(sessionFactory);
        this.competenciaDao = new CompetenciaDaoHibernateImpl(sessionFactory);
        
    }
    
    
    
    public void run () {
        /**
         * parametros Controlador + torneo donde se realizaran las competencias
         */
        new UIRegistrarAspirante(this, torneoDao.buscarPorNombre("Cordoba Aniversario Primera Parte")).setVisible(true);
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
    
    public List <Disciplina> listarDisciplinas(Torneo torneo){
        return disciplinaDao.listarDisciplinas(torneo);
    }
    
    public List <Disciplina> disciplinasPorDefecto(Torneo torneo){
        List<Disciplina> retorno = new ArrayList<>();
        retorno.add(disciplinaDao.buscarPorNombre("100 metros llanos", torneo));
        retorno.add(disciplinaDao.buscarPorNombre("50 metros con vallas",torneo));
        
        return retorno;
    }
    
    public void guardarInscipcion(List<AspiranteVO> aspirantes){
        for (AspiranteVO aspirante : aspirantes) {
            
        }
    
    }
    
    public Competencia buscarCometetenciaDeDisciplinaConCategoria(Disciplina disciplina, Categoria categoria){
        return competenciaDao.buscarPorDisciplinaYCategoria(disciplina, categoria);
    
    }
    
}
