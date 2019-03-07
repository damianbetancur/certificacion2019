/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.betancur.dao.impl;

import com.betancur.Categoria;
import com.betancur.Competencia;
import com.betancur.Disciplina;
import com.betancur.dao.CompetenciaDao;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Ariel
 */
public class CompetenciaDaoImpl implements CompetenciaDao {

    private final List<Competencia> competencias;

    public CompetenciaDaoImpl() {
        this.competencias = new ArrayList<>();
    }

    @Override
    public Competencia buscarPorDisciplinaYCategoria(Disciplina disciplina, Categoria categoria) {
        Competencia retorno = null;

        Iterator<Competencia> iter = competencias.iterator();
        while (iter.hasNext()) {
            Competencia actual = iter.next();

            if (actual.getDisciplina().equals(disciplina)) {
                if (actual.getCategoria().equals(categoria)) {
                    retorno = actual;
                    break;
                }
            }

        }
        return retorno;
    }
}
