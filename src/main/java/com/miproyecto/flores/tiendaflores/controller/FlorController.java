package com.miproyecto.flores.tiendaflores.controller;


import com.miproyecto.flores.tiendaflores.common.ExistenciaFlor;
import com.miproyecto.flores.tiendaflores.common.TipoFlor;
import com.miproyecto.flores.tiendaflores.entities.Flor;
import com.miproyecto.flores.tiendaflores.service.FlorService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@Slf4j
@RequestMapping
public class FlorController {

    @Autowired
    FlorService florService;

    @GetMapping
    public String findAll(Model model){
        log.info("[findAll]");
        List<Flor> list=florService.findAll();
        log.debug("[Flores List:{}]", list);
        model.addAttribute("list", list);
        model.addAttribute("tipo", TipoFlor.values());
        model.addAttribute("existencia", ExistenciaFlor.values());
        return "/buscador/tipo_flores";
    }
    @GetMapping("/f")
    public String buscarFlor(String nombre, TipoFlor tipoFlor, Model model){
        log.info("[buscarFlor]");
        List<Flor> list;
    }




}
