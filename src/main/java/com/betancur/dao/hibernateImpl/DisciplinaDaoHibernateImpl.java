/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.betancur.dao.hibernateImpl;

import com.betancur.Disciplina;
import com.betancur.dao.DisciplinaDao;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author Ariel
 */
public class DisciplinaDaoHibernateImpl implements DisciplinaDao{
    private final SessionFactory sessionFactory;

    public DisciplinaDaoHibernateImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    
    
    @Override
    public Disciplina buscarPorNombre(String nombre) {
        Session session = sessionFactory.openSession();
        
        Disciplina disciplina = (Disciplina) session.createQuery("SELECT d FROM Disciplina d WHERE nombre=:nombre").setParameter("nombre", nombre).uniqueResult();
                
        return disciplina;
    }

    @Override
    public List<Disciplina> listarDisciplinas() {
        Session session = sessionFactory.openSession();
        
        Query query = session.createQuery("SELECT d FROM Disciplina d");
        
        
        List<Disciplina> disciplinas = query.list();
                
        session.close();
        
        return disciplinas;
    }
    
}
