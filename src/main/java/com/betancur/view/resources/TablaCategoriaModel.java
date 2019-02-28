/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.betancur.view.resources;


import com.betancur.Categoria;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Ariel
 */
public class TablaCategoriaModel extends AbstractTableModel{
    private static final String[] COLUMNAS = {""};
    
    private List<Categoria> categorias;

    public TablaCategoriaModel() {
    }

    public TablaCategoriaModel(List<Categoria> categorias) {
        this.categorias = categorias;
    }

    @Override
    public int getRowCount() {
        return categorias == null ? 0 : categorias.size();
    }

    @Override
    public int getColumnCount() {
        return 1;
    }

    @Override
    public Object getValueAt(int fila, int columna) {
        Object retorno = null;
        Categoria categoria = categorias.get(fila);
        
        // según la columna deseada obtenemos el valor a mostrar
        switch (columna) {
            case 0:
                retorno = categoria.getNombreCategoria();
                break;            
        }
        
        return retorno;
    }
    
    @Override
    public String getColumnName(int index) {
        return COLUMNAS[index];
    }

    public void setCategorias(List<Categoria> categorias) {
        this.categorias = categorias;
    }
}
