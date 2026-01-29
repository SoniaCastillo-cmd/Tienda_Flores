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
public class FlorController {

    @Autowired
    FlorService florService;

    @GetMapping("/b")
    public String findAll(Model model){
        log.info("[findAll]");
        List<Flor> list=florService.findAll();
        log.debug("[Flores List:{}]", list);
        model.addAttribute("list", list);
        model.addAttribute("tipos", TipoFlor.values());
        model.addAttribute("existencia", ExistenciaFlor.values());
        return "buscador/buscadorFlores";
    }

    }





