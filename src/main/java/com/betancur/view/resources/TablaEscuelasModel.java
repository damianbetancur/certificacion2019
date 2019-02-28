
package com.betancur.view.resources;

import com.betancur.Escuela;
import java.util.ArrayList;

import java.util.List;
import javax.swing.table.AbstractTableModel;

public final class TablaEscuelasModel extends AbstractTableModel {

    private static final String[] COLUMNAS = {""};
    
    private List<Escuela> escuelas;

    public TablaEscuelasModel() {
        escuelas = new ArrayList<>();
    }

    public TablaEscuelasModel(List<Escuela> escuelas) {
        this.escuelas = escuelas;
    }

    @Override
    public int getRowCount() {
        return escuelas == null ? 0 : escuelas.size();
    }

    @Override
    public int getColumnCount() {
        return 1;
    }

    @Override
    public Object getValueAt(int fila, int columna) {
        Object retorno = null;
        Escuela escuela = escuelas.get(fila);
        
        // según la columna deseada obtenemos el valor a mostrar
        switch (columna) {
            case 0:
                retorno = escuela.getNombre();
                break;            
        }
        
        return retorno;
    }
    
    @Override
    public String getColumnName(int index) {
        return COLUMNAS[index];
    }

    public void setEscuelas(List<Escuela> escuelas) {
        this.escuelas = escuelas;
    }
    
    public Escuela obtenerEscuelaEn (int fila) {
        return escuelas.get(fila);
    }
}
