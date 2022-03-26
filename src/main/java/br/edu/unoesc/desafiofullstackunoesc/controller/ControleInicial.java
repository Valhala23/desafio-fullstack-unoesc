package br.edu.unoesc.desafiofullstackunoesc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class ControleInicial {

    @GetMapping("/")
	public String indice()
    {        
        return "index";
	}    
}
