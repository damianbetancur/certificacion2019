/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.betancur.dao.hibernateImpl;

import com.betancur.Categoria;
import com.betancur.Competencia;
import com.betancur.Disciplina;
import com.betancur.dao.CompetenciaDao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author Ariel
 */
public class CompetenciaDaoHibernateImpl implements CompetenciaDao{
    
    private final SessionFactory sessionFactory;

    public CompetenciaDaoHibernateImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    
    
    
    @Override
    public Competencia buscarPorDisciplinaYCategoria(Disciplina disciplina, Categoria categoria) {
        Session session = sessionFactory.openSession();
        
        Competencia competencia = (Competencia) session.createQuery("SELECT c FROM Competencia c WHERE id_categoria=:idCategoria AND id_disciplina=:idDisciplina").setParameter("idDisciplina", disciplina.getId()).setParameter("idCategoria", categoria.getId()).uniqueResult();
                
        return competencia;
    }
    
}
