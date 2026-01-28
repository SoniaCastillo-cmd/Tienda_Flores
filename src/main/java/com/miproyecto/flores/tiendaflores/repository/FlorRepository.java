package com.miproyecto.flores.tiendaflores.repository;

import com.miproyecto.flores.tiendaflores.common.TipoFlor;
import com.miproyecto.flores.tiendaflores.entities.Flor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FlorRepository  extends JpaRepository<Flor, Long> {

    Flor findByNombre(String nombre);

    List<Flor> findByTipo(TipoFlor tipo);

    List<Flor> findByColor(String color);
}
