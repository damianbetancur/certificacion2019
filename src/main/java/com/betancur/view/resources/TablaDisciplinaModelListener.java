/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.betancur.view.resources;


import com.betancur.view.UIRegistrarAspirante;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;

/**
 *
 * @author Ariel
 */
public class TablaDisciplinaModelListener implements TableModelListener {

    private final UIRegistrarAspirante pantallaRegistrarAspirante;

    public TablaDisciplinaModelListener(UIRegistrarAspirante pantallaRegistrarAspirante) {
        this.pantallaRegistrarAspirante = pantallaRegistrarAspirante;
    }

    

    @Override
    public void tableChanged(TableModelEvent e) {
        int fila = pantallaRegistrarAspirante.getTablaDisciplinas().getSelectedRow();
        
        boolean seleccion = (boolean) pantallaRegistrarAspirante.getTablaDisciplinas().getValueAt(fila, 0);
        
        if (seleccion) {
            pantallaRegistrarAspirante.getAspiranteSeleccionadoVO().getDisciplinas().get(fila).setActivo(true);
        }else{
            pantallaRegistrarAspirante.getAspiranteSeleccionadoVO().getDisciplinas().get(fila).setActivo(false);
        }
        
        pantallaRegistrarAspirante.seleccionarCategoriaDeDisciplina(fila);
        
    }

   
    
    


}
