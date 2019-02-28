/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.betancur.dao.impl;


import com.betancur.Categoria;
import com.betancur.dao.CategoriaDao;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Ariel
 */
public class CategoriaDaoImpl implements CategoriaDao{

    private final List<Categoria> categorias;
    
    public CategoriaDaoImpl() {
        this.categorias = new ArrayList<>();
        
        // agregamos las categorias iniciales
        /*
        this.categorias.add(new Categoria(11, 6, "Infantiles Varones"));
        this.categorias.add(new Categoria(11, 6, "Infantiles Mujeres"));
        this.categorias.add(new Categoria(17, 12, "Menores Varones"));
        this.categorias.add(new Categoria(17, 12, "Menores Mujeres"));
*/
    }

    
    @Override
    public Categoria buscarPorNombre(String nombre) {
        Categoria retorno = null;
        
        Iterator<Categoria> iter = categorias.iterator();
        while (iter.hasNext()) {
            Categoria actual = iter.next();
            
            if (actual.getNombreCategoria().equals(nombre)) {
                retorno = actual;
                break;
            }
        }
        return retorno;
    }

    @Override
    public List<Categoria> listarCategorias() {
        List<Categoria> retorno = new ArrayList<>();
        
        Iterator<Categoria> iter = categorias.iterator();
        while (iter.hasNext()) {
            Categoria actual = iter.next();
                retorno.add(actual);
        }
        return retorno;
    }
    
}
