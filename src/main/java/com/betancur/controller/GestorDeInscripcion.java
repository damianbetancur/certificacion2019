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
import com.betancur.Inscripcion;
import com.betancur.Torneo;
import com.betancur.dao.AspiranteDao;
import com.betancur.dao.CategoriaDao;
import com.betancur.dao.CompetenciaDao;
import com.betancur.dao.hibernateImpl.CategoriaDaoHibernateImpl;
import com.betancur.dao.DisciplinaDao;
import com.betancur.dao.hibernateImpl.DisciplinaDaoHibernateImpl;
import com.betancur.dao.EscuelaDao;
import com.betancur.dao.InscripcionDao;
import com.betancur.dao.TorneoDao;
import com.betancur.dao.hibernateImpl.AspiranteDaoHibernateImpl;
import com.betancur.dao.hibernateImpl.CompetenciaDaoHibernateImpl;
import com.betancur.dao.hibernateImpl.EscuelaDaoHibernateImpl;
import com.betancur.dao.hibernateImpl.InscripcionDaoHibernateImpl;
import com.betancur.dao.hibernateImpl.TorneoDaoHibernateImpl;
import com.betancur.view.UIRegistrarAspirante;
import com.betancur.vo.AspiranteVO;
import com.betancur.vo.DisciplinaVO;
import java.util.ArrayList;
import java.util.Date;
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
    private final AspiranteDao aspiranteDao;
    private final InscripcionDao inscripcionDao;
    
    private Escuela escuelaEncontrada;
    
    public GestorDeInscripcion(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
        
        this.escuelaDao = new EscuelaDaoHibernateImpl(sessionFactory);
        this.categoriaDao = new CategoriaDaoHibernateImpl(sessionFactory);
        this.disciplinaDao = new DisciplinaDaoHibernateImpl(sessionFactory);
        this.torneoDao = new TorneoDaoHibernateImpl(sessionFactory);
        this.competenciaDao = new CompetenciaDaoHibernateImpl(sessionFactory);
        this.aspiranteDao = new AspiranteDaoHibernateImpl(sessionFactory);
        this.inscripcionDao = new InscripcionDaoHibernateImpl(sessionFactory);
        
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
        Long idAspirante = 0l;
        Aspirante aspiranteAuxiliar;
        Competencia competencia;
        Inscripcion nuevaInscripcion;
        for (AspiranteVO aspirante : aspirantes) {
            idAspirante = aspiranteDao.guardar(aspirante.getAspirante());
            for (DisciplinaVO disciplina : aspirante.getDisciplinas()) {
                if (disciplina.getActivo()) {
                    competencia = buscarCometetenciaDeDisciplinaConCategoria(disciplina.getDisciplina(), disciplina.getCategoria());
                    //guardar Aspirante porque esta en nulo
                    //aspiranteDao.
                    aspiranteAuxiliar = aspiranteDao.buscarPorID(idAspirante);
                    nuevaInscripcion = new Inscripcion(aspiranteAuxiliar, competencia, Boolean.FALSE, new Date());
                    
                    
                    inscripcionDao.guardar(nuevaInscripcion);
                    System.out.println("aspirante: "+nuevaInscripcion.getAspirante().getId());
                    System.out.println("competencia diferente: "+nuevaInscripcion.getCompetencia().getId());
                    System.out.println("competencia diferente: "+competencia.getId());
                    System.out.println("competencia diferente: "+competencia.getCategoria().getNombreCategoria());
                    System.out.println("competencia diferente: "+competencia.getDisciplina().getNombre());
                }
            }
        }
    
    }
    
    public Competencia buscarCometetenciaDeDisciplinaConCategoria(Disciplina disciplina, Categoria categoria){
        return competenciaDao.buscarPorDisciplinaYCategoria(disciplina, categoria);
    
    }
    
}
