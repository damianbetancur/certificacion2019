
package com.betancur.dao;

import com.betancur.Disciplina;
import java.util.List;

public interface DisciplinaDao {
    public Disciplina buscarPorNombre (String nombre);
    public List<Disciplina> listarDisciplinas();
}
