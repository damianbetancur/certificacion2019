
package com.betancur.dao;

import com.betancur.Inscripcion;

public interface InscripcionDao {
    public Inscripcion buscarPorNombre (String nombre);
    public void guardar (Inscripcion nuevaInscripcion);
}
