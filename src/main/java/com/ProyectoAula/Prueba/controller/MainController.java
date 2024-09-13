package com.ProyectoAula.Prueba.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/homepage")
    public String homepage(){
        return "homepage";
    }

    @GetMapping("/comprar")
    public String comprar(){
        return "comprar";
    }
    @GetMapping("/acerca")
    public String acercaDeNosotros(){
        return"acerca";
    }

    @GetMapping("/terminos")
    public String terminos(){
        return"terminos";
    }

    @GetMapping("/soporte")
    public String soporte(){
        return "soporte";
    }
}