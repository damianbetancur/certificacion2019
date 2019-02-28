
package com.betancur.dao;

import com.betancur.Aspirante;
import java.util.List;

public interface AspiranteDao {
    public Aspirante buscarPorNombre (String nombre);
    public List<Aspirante> listarAspirantes();
}
