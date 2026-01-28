package com.miproyecto.flores.tiendaflores.service;


import com.miproyecto.flores.tiendaflores.common.TipoFlor;
import com.miproyecto.flores.tiendaflores.entities.Flor;
import com.miproyecto.flores.tiendaflores.repository.FlorRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class FlorServiceImpl implements FlorService{


    @Autowired
    private FlorRepository florRepository;



    @Override
    public List<Flor> findAll() {
        return List.of();
    }

    @Override
    public Flor findByName(String nombre) {
        return null;
    }

    @Override
    public List<Flor> findByTipo(TipoFlor tipo) {
        return List.of();
    }

    @Override
    public List<Flor> findByColor(String color) {
        return List.of();
    }
}
