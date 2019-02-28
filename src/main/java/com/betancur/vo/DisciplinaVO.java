/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.betancur.vo;

import com.betancur.Categoria;
import com.betancur.Disciplina;

/**
 *
 * @author Ariel
 */
public class DisciplinaVO {
    private Disciplina disciplina;
    private Categoria categoria;
    private boolean activo;

    public DisciplinaVO() {
    }

    public boolean getActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

   
    
}
