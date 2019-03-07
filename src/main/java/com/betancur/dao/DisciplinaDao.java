
package com.betancur.dao;

import com.betancur.Disciplina;
import com.betancur.Torneo;
import java.util.List;

public interface DisciplinaDao {
    public Disciplina buscarPorNombre (String nombreDisciplina, Torneo torneo);
    public List<Disciplina> listarDisciplinas(Torneo torneo);
}
