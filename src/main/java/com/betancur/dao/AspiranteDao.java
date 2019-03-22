
package com.betancur.dao;

import com.betancur.Aspirante;
import java.util.List;

public interface AspiranteDao {
    public Aspirante buscarPorID (Long id);
    public List<Aspirante> listarAspirantes();
    public Long guardar (Aspirante nuevoAspirante);
    
}
