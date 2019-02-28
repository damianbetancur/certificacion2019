
package com.betancur.view.resources;


import com.betancur.vo.AspiranteVO;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class TablaAspirantesModel extends AbstractTableModel{
    private static final String[] COLUMNAS = {""};
    
    private List<AspiranteVO> aspirantes;

    public TablaAspirantesModel() {
    }

    public TablaAspirantesModel(List<AspiranteVO> aspirantes) {
        this.aspirantes = aspirantes;
    }

    @Override
    public int getRowCount() {
        return aspirantes == null ? 0 : aspirantes.size();
    }

    @Override
    public int getColumnCount() {
        return 1;
    }

    @Override
    public Object getValueAt(int fila, int columna) {
        Object retorno = null;
        AspiranteVO aspirante = aspirantes.get(fila);
        
        // según la columna deseada obtenemos el valor a mostrar
        switch (columna) {
            case 0:
                retorno = aspirante.getAspirante().getNombres() +" "+ aspirante.getAspirante().getApellido();
                break;            
        }
        
        return retorno;
    }
    
    @Override
    public String getColumnName(int index) {
        return COLUMNAS[index];
    }

    public void setAspirantes(List<AspiranteVO> aspirantes) {
        this.aspirantes = aspirantes;
    }
    
    public int obtenerAspiranteEn (AspiranteVO aspiranteSeleccionado) {
        int filaAspirante = 0;
        int filaRecorrido = 0;
        for (AspiranteVO aspiranteRecorrido : aspirantes) {
            filaRecorrido = filaRecorrido + 1;
            if (aspiranteRecorrido.getAspirante().equals(aspiranteSeleccionado.getAspirante())) {
                filaAspirante = filaRecorrido;
            }
        }
        return filaAspirante;
    }
}
