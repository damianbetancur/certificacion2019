/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.betancur.dao.impl;

import com.betancur.Torneo;
import com.betancur.dao.TorneoDao;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Ariel
 */
public class TorneoDaoImpl implements TorneoDao{

     private final List<Torneo> torneos;

    public TorneoDaoImpl() {
        this.torneos = new ArrayList<>();
    }
    
     
    @Override
    public Torneo buscarPorNombre(String nombre) {
        Torneo retorno = null;
        
        Iterator<Torneo> iter = torneos.iterator();
        while (iter.hasNext()) {
            Torneo actual = iter.next();
            
            if (actual.getNombre().equals(nombre)) {
                retorno = actual;
                break;
            }
        }
        return retorno;
    }
    
}
