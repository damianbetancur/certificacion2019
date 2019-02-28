/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.betancur.dao.hibernateImpl;

import com.betancur.Escuela;
import com.betancur.dao.EscuelaDao;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


/**
 *
 * @author Ariel
 */
public class EscuelaDaoHibernateImpl implements EscuelaDao{

    private final SessionFactory sessionFactory;

    public EscuelaDaoHibernateImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    
    
    @Override
    public Escuela buscarPorNombre(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Escuela> listarEscuelas() {
        
        Session session = sessionFactory.openSession();
        
        Query query = session.createQuery("SELECT e FROM Escuela e");
        List<Escuela> escuelas = query.list();
                
        session.close();
        
        return escuelas;
    }
    
}
