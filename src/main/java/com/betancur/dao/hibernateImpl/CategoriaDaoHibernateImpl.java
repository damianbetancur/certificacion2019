/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.betancur.dao.hibernateImpl;

import com.betancur.Categoria;
import com.betancur.dao.CategoriaDao;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author Ariel
 */
public class CategoriaDaoHibernateImpl implements CategoriaDao{
    private final SessionFactory sessionFactory;

    public CategoriaDaoHibernateImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    
    
    @Override
    public Categoria buscarPorNombre(String nombre) {
        Session session = sessionFactory.openSession();
        
        Categoria categoria = (Categoria) session.createQuery("SELECT c FROM Categoria c WHERE nombreCategoria=:nombre").setParameter("nombre", nombre).uniqueResult();
                
        return categoria;
    }

    @Override
    public List<Categoria> listarCategorias() {
        Session session = sessionFactory.openSession();
        
        Query query = session.createQuery("SELECT c FROM Categoria c");
        
        
        List<Categoria> categorias = query.list();
                
        session.close();
        
        return categorias;
    }
    
}
