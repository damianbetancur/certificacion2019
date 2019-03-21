/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.betancur.view.resources;

import com.betancur.Categoria;
import com.betancur.vo.DisciplinaVO;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Ariel
 */
public class TablaCategoriaModel extends AbstractTableModel {

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

    public int obtenerFilaDeCategoriaDeDisciplinaActiva(DisciplinaVO disciplinaParametro) {
        int filaCategoria = 0;
        int contador = 0;
        for (Categoria categoria : categorias) {
            contador = contador + 1;
            if (categoria.getId() == disciplinaParametro.getCategoria().getId()) {
                filaCategoria = contador;
            }
        }
        return filaCategoria;
    }

    public Categoria obtenerCategoriaEn(int fila) {
        return categorias.get(fila);
    }

    public int obtenerFilaDeCategoria(Categoria categoria) {
        int filaCategoria = 0;
        int contador = 0;
        for (Categoria categoriaR : categorias) {
            contador = contador + 1;
            if (categoriaR.getId() == categoria.getId()) {
                filaCategoria = contador;
            }
        }
        return filaCategoria;

    }
}
