/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.betancur.dao.hibernateImpl;

import com.betancur.Torneo;
import com.betancur.dao.TorneoDao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author Ariel
 */
public class TorneoDaoHibernateImpl implements TorneoDao{

    private final SessionFactory sessionFactory;
    
    public TorneoDaoHibernateImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    
    @Override
    public Torneo buscarPorNombre(String nombre) {
        Session session = sessionFactory.openSession();
        
        Torneo torneo = (Torneo) session.createQuery("SELECT t FROM Torneo t WHERE nombre=:nombre").setParameter("nombre", nombre).uniqueResult();
                
        return torneo;
    }
    
}
