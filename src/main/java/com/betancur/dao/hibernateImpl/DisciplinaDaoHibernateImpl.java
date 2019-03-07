/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.betancur.dao.hibernateImpl;

import com.betancur.Disciplina;
import com.betancur.Torneo;
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
    public Disciplina buscarPorNombre(String nombre, Torneo torneo) {
        Session session = sessionFactory.openSession();
        
        Disciplina disciplina = (Disciplina) session.createQuery("SELECT d FROM Disciplina d WHERE nombre=:nombre AND id_torneo=:idTorneo").setParameter("nombre", nombre).setParameter("idTorneo", torneo.getId()).uniqueResult();
                
        return disciplina;
    }

    @Override
    public List<Disciplina> listarDisciplinas(Torneo torneo) {
        Session session = sessionFactory.openSession();
        
        Query query = session.createQuery("SELECT d FROM Disciplina d WHERE id_torneo=:idTorneo").setParameter("idTorneo", torneo.getId());
        
        
        List<Disciplina> disciplinas = query.list();
                
        session.close();
        
        return disciplinas;
    }
    
}
