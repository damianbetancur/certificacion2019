/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.betancur.view.resources;

import com.betancur.Aspirante;
import com.betancur.view.UIRegistrarAspirante;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author Ariel
 */
public class TablaAspirantesModelListener implements ListSelectionListener {
    
    private final UIRegistrarAspirante pantallaRegistrarAspirante;

    public TablaAspirantesModelListener(UIRegistrarAspirante pantallaRegistrarAspirante) {
        this.pantallaRegistrarAspirante = pantallaRegistrarAspirante;
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        //Corregir todo el metodo, capaz que no se utilice porque no se contempla la seleccion
        // obtenemos la escuela seleccionada
        //Aspirante seleccionado = pantallaRegistrarAspirante.seleccionarAspirante();
        
        //if(seleccionado!=null){
            //ver
        //}
        
        
        
    }
    
}
