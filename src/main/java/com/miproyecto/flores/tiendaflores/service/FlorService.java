package com.miproyecto.flores.tiendaflores.service;

import com.miproyecto.flores.tiendaflores.common.TipoFlor;
import com.miproyecto.flores.tiendaflores.entities.Flor;

import java.util.List;

public interface FlorService {

    public List<Flor> findAll();
    public Flor findByName(String nombre);
    public List<Flor> findByTipo(TipoFlor tipo);
    public List<Flor> findByColor (String color);
}
