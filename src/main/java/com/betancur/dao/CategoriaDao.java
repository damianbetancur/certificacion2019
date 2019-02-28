
package com.betancur.dao;

import com.betancur.Categoria;
import java.util.List;


public interface CategoriaDao {
    public Categoria buscarPorNombre (String nombre);
    public List<Categoria> listarCategorias ();
}
