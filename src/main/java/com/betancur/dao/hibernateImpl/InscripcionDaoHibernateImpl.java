/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.betancur.dao.hibernateImpl;

import com.betancur.Inscripcion;
import com.betancur.dao.InscripcionDao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author Ariel
 */
public class InscripcionDaoHibernateImpl implements InscripcionDao{

    private final SessionFactory sessionFactory;

    public InscripcionDaoHibernateImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    
    
    @Override
    public Inscripcion buscarPorNombre(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void guardar(Inscripcion nuevaInscripcion) {
        Session session = this.sessionFactory.openSession();
        session.beginTransaction();
        session.save(nuevaInscripcion);
        session.getTransaction().commit();
        session.close();
    }
    
}
