/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.betancur.vo;

import com.betancur.Aspirante;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ariel
 */
public class AspiranteVO {
    private Aspirante aspirante;
    private List<DisciplinaVO> disciplinas;

    public AspiranteVO(Aspirante aspirante) {
        this.aspirante = aspirante;
        disciplinas = new ArrayList<>();
    }

    public Aspirante getAspirante() {
        return aspirante;
    }

    public void setAspirante(Aspirante aspirante) {
        this.aspirante = aspirante;
    }

    public List<DisciplinaVO> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<DisciplinaVO> disciplinas) {
        this.disciplinas = disciplinas;
    }
    
    
}
