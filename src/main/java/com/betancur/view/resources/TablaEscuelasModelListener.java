/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.betancur.view.resources;

import com.betancur.Escuela;
import com.betancur.view.UINuevoAspirante;
import com.betancur.view.UIRegistrarAspirante;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author Ariel
 */
public class TablaEscuelasModelListener implements ListSelectionListener {
    
    private final UIRegistrarAspirante pantallaRegistrarAspirante;

    public TablaEscuelasModelListener(UIRegistrarAspirante pantallaRegistrarAspirante) {
        this.pantallaRegistrarAspirante = pantallaRegistrarAspirante;
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        // obtenemos la escuela seleccionada
        Escuela seleccionada = pantallaRegistrarAspirante.seleccionarEscuela();
        
        if(seleccionada!=null){
            pantallaRegistrarAspirante.getControlador().setEscuelaEncontrada(seleccionada);
            //bloquea tabla escuela para que no se seleccione otra
            pantallaRegistrarAspirante.getTablaEscuelas().setEnabled(false);
            pantallaRegistrarAspirante.getTablaEscuelas().getSelectedRow();
            UINuevoAspirante nuevoAspirante = new UINuevoAspirante(pantallaRegistrarAspirante, true);
            nuevoAspirante.setLocationRelativeTo(pantallaRegistrarAspirante);
            nuevoAspirante.setVisible(true);
        }
        
        
        
    }
    
}
