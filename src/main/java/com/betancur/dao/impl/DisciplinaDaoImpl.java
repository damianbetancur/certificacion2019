/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.betancur.dao.impl;

import com.betancur.Disciplina;
import com.betancur.Torneo;
import com.betancur.dao.DisciplinaDao;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Ariel
 */
public class DisciplinaDaoImpl implements DisciplinaDao {

    private final List<Disciplina> disciplinas;

    public DisciplinaDaoImpl() {
        this.disciplinas = new ArrayList<>();

        // agregamos los disciplinas iniciales si es necesario
    }

    @Override
    public Disciplina buscarPorNombre(String nombre, Torneo torneo) {
        Disciplina retorno = null;

        Iterator<Disciplina> iter = disciplinas.iterator();
        while (iter.hasNext()) {
            Disciplina actual = iter.next();

            if (actual.getNombre().equals(nombre)) {
                if (actual.getTorneo().getNombre() == torneo.getNombre()) {
                    retorno = actual;
                    break;
                }
            }
        }
        return retorno;
    }

    @Override
    public List<Disciplina> listarDisciplinas(Torneo torneo) {
        List<Disciplina> retorno = new ArrayList<>();

        Iterator<Disciplina> iter = disciplinas.iterator();
        while (iter.hasNext()) {
            Disciplina actual = iter.next();
            if (actual.getTorneo().getNombre() == torneo.getNombre()) {
                retorno.add(actual);
            }

        }
        return retorno;
    }

}
