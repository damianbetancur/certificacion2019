/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.betancur.dao.hibernateImpl;

import com.betancur.Aspirante;
import com.betancur.dao.AspiranteDao;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author Ariel
 */
public class AspiranteDaoHibernateImpl implements AspiranteDao{
    private final SessionFactory sessionFactory;

    public AspiranteDaoHibernateImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    
    
    @Override
    public Aspirante buscarPorID(Long id) {
        Session session = sessionFactory.openSession();
        
        Aspirante aspirante = (Aspirante) session.createQuery("SELECT a FROM Aspirante a WHERE id=:id").setParameter("id", id).uniqueResult();
                
        return aspirante;
    }

    @Override
    public List<Aspirante> listarAspirantes() {
        Session session = sessionFactory.openSession();
        
        Query query = session.createQuery("SELECT a FROM Aspirante a");
        
        
        List<Aspirante> aspirantes = query.list();
                
        session.close();
        
        return aspirantes;
    }

    @Override
    public Long guardar(Aspirante nuevoAspirante) {
        Session session = this.sessionFactory.openSession();
        session.beginTransaction();         
        Long idGenerado = ( Long )session.save(nuevoAspirante); 
        session.getTransaction().commit();
        session.close();
        return idGenerado;
    }
    
}
