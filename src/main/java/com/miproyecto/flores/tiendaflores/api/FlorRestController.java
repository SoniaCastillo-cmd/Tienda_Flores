package com.miproyecto.flores.tiendaflores.api;


import com.miproyecto.flores.tiendaflores.common.TipoFlor;
import com.miproyecto.flores.tiendaflores.entities.Flor;
import com.miproyecto.flores.tiendaflores.service.FlorService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/api")
public class FlorRestController {

    @Autowired
    private FlorService florService;


    @GetMapping("/b/f") //buscar flores
    public List<Flor> findAll() {
        return florService.findAll();
    }


    @GetMapping("/b/f/n/{n}")//buscar flores por nombre
    public Flor findByName(@PathVariable(name = "n") String nombre) {
        log.info("[findAll]");
        log.debug("[nombre:{}]", nombre);
        return florService.findByName(nombre);
    }

    @GetMapping("/b/f/t/{t}") // buscar flores por tipo
    public List<Flor> findByTipo(@PathVariable(name = "t") TipoFlor tipo) {
        log.info("[findByTipo]");
        log.debug("[tipo:{}]", tipo);
        return florService.findByTipo(tipo);
    }

    @GetMapping("/b/f/c/{c}") //buscar flores por color
    public List<Flor> findByColor(@PathVariable(name = "c") String color) {
        log.info("[findByColor]");
        log.debug("[color:{}]", color);
        return florService.findByColor(color);
    }

}
