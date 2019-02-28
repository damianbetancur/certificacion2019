/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.betancur.dao.impl;

import com.betancur.Escuela;
import com.betancur.dao.EscuelaDao;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Ariel
 */
public class EscuelaDaoImpl implements EscuelaDao{

    private final List<Escuela> escuelas;

    public EscuelaDaoImpl() {
        escuelas = new ArrayList<>();
    }
    
    
    @Override
    public Escuela buscarPorNombre(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Escuela> listarEscuelas() {
        List<Escuela> retorno = new ArrayList<>();
        
        Iterator<Escuela> iter = escuelas.iterator();
        while (iter.hasNext()) {
            Escuela actual = iter.next();
                retorno.add(actual);
        }
        return retorno;
    }
    
}
