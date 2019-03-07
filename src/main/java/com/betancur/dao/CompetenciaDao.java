
package com.betancur.dao;

import com.betancur.Categoria;
import com.betancur.Competencia;
import com.betancur.Disciplina;


public interface CompetenciaDao {
    public Competencia buscarPorDisciplinaYCategoria (Disciplina disciplina, Categoria categoria);
}
