
package com.betancur.dao;

import com.betancur.Escuela;
import java.util.List;

public interface EscuelaDao {
    public Escuela buscarPorNombre (String nombre);
    public List<Escuela> listarEscuelas ();
}
