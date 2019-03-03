/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.betancur.view.resources;

import com.betancur.vo.AspiranteVO;
import com.betancur.vo.DisciplinaVO;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author David
 */
public class TablaDisciplinasModel extends AbstractTableModel {

    private static final String[] COLUMNAS = {""};

    private boolean[] editable = {true, false};
    private List<DisciplinaVO> disciplinas;

    public TablaDisciplinasModel() {
        disciplinas = new ArrayList<>();
    }

    public TablaDisciplinasModel(List<DisciplinaVO> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public void visualizar(JTable tabla) {

        tabla.setDefaultRenderer(Object.class, new Render());

        DefaultTableModel dt = new DefaultTableModel(new String[]{"", "Disciplina"}, 0) {

            Class[] types = new Class[]{
                java.lang.Boolean.class,
                java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            public boolean isCellEditable(int row, int column) {
                return editable[column];
            }
        };
       
        if (disciplinas.size() > 0) {
            for (int i = 0; i < disciplinas.size(); i++) {
                Object fila[] = new Object[2];
                fila[0] = disciplinas.get(i).getActivo();
                fila[1] = disciplinas.get(i).getDisciplina().getNombre();

                dt.addRow(fila);

            }

        }

        tabla.setModel(dt);
        tabla.getColumnModel().getColumn(0).setPreferredWidth(20);
        tabla.getColumnModel().getColumn(1).setPreferredWidth(220);
    }

    public List<DisciplinaVO> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<DisciplinaVO> disciplinas) {
        this.disciplinas = disciplinas;
    }

    @Override
    public int getRowCount() {
        return disciplinas == null ? 0 : disciplinas.size();
    }

    @Override
    public int getColumnCount() {
        return 1;
    }

    @Override
    public Object getValueAt(int fila, int columna) {
        Object retorno = null;
        DisciplinaVO aspirante = disciplinas.get(fila);

        // según la columna deseada obtenemos el valor a mostrar
        switch (columna) {
            case 0:
                retorno = aspirante.getDisciplina().getNombre();
                break;
        }

        return retorno;
    }

    @Override
    public String getColumnName(int index) {
        return COLUMNAS[index];
    }

    
    public DisciplinaVO obtenerDisciplinaEn(int filaDisciplina) {
        DisciplinaVO disciplinaEncontrada = null;  
        disciplinaEncontrada = disciplinas.get(filaDisciplina);        
        return disciplinaEncontrada;
    }
    
     public int obtenerLaPrimeraDisciplinaActivaEn(AspiranteVO aspirante) {
        boolean primeraEncontrada = false;
        int filaDisciplina = 0;
        int filaRecorrido = 0;
        for (DisciplinaVO disciplinaeRecorrido : aspirante.getDisciplinas()) {
            filaRecorrido = filaRecorrido + 1;
            if (disciplinaeRecorrido.getActivo()==true && primeraEncontrada==false) {
                primeraEncontrada = true;
                filaDisciplina = filaRecorrido;
            }
        }
        return filaDisciplina;
    }

}
