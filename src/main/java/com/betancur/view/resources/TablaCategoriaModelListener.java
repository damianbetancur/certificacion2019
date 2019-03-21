/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.betancur.view.resources;

import com.betancur.Categoria;
import com.betancur.view.UINuevoAspirante;
import com.betancur.view.UIRegistrarAspirante;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author Ariel
 */
public class TablaCategoriaModelListener implements ListSelectionListener {
    
    private final UIRegistrarAspirante pantallaRegistrarAspirante;

    public TablaCategoriaModelListener(UIRegistrarAspirante pantallaRegistrarAspirante) {
        this.pantallaRegistrarAspirante = pantallaRegistrarAspirante;
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        // obtenemos la escuela seleccionada
        Categoria seleccionada = pantallaRegistrarAspirante.seleccionarCategoria();
        
        if(seleccionada!=null){
            pantallaRegistrarAspirante.setCategoriaSeleccionada(seleccionada);
            pantallaRegistrarAspirante.pintarFilaTablaCategoria(pantallaRegistrarAspirante.getTablaCategoriasModel().obtenerFilaDeCategoria(seleccionada));
            
        }
        
        
        
    }
    
}
