
package com.betancur.dao.impl;

import com.betancur.Aspirante;
import com.betancur.dao.AspiranteDao;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class AspiranteDaoImpl implements AspiranteDao{
    
    private final List<Aspirante> aspirantes;

    public AspiranteDaoImpl() {
        this.aspirantes = new ArrayList<>();
        
        // agregamos los aspirantes iniciales si es necesario
        
    }
    
    
    @Override
    public Aspirante buscarPorNombre(String nombre) {
        Aspirante retorno = null;
        
        Iterator<Aspirante> iter = aspirantes.iterator();
        while (iter.hasNext()) {
            Aspirante actual = iter.next();
            
            if (actual.getNombres().equals(nombre)) {
                retorno = actual;
                break;
            }
        }
        return retorno;
    }

    @Override
    public List<Aspirante> listarAspirantes() {
         List<Aspirante> retorno = new ArrayList<>();
        
        Iterator<Aspirante> iter = aspirantes.iterator();
        while (iter.hasNext()) {
            Aspirante actual = iter.next();
                retorno.add(actual);
        }
        return retorno;
    }
    
}
