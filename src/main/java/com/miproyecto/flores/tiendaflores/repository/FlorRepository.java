package com.miproyecto.flores.tiendaflores.repository;

import com.miproyecto.flores.tiendaflores.entities.Flor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlorRepository  extends JpaRepository<Flor, Long> {

}
