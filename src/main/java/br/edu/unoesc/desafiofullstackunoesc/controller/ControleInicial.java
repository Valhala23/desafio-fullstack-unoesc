package br.edu.unoesc.desafiofullstackunoesc.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import br.edu.unoesc.desafiofullstackunoesc.model.Municipio;
import br.edu.unoesc.desafiofullstackunoesc.repository.MunicipioRepository;
import br.edu.unoesc.desafiofullstackunoesc.service.UsuarioService;



@CrossOrigin
@Controller
public class ControleInicial {

    @Autowired
    MunicipioRepository dao;

    @Autowired
    UsuarioService usuarioService;

    @GetMapping("/")
	public String indice()
    {        
        return "index";
	}

    @GetMapping("/testeinsere")
	public String insereTeste()
    {     

        try {
           // Para teste vou criar um cliente aqui e salvat
           Municipio mun = new Municipio();
           mun.setCodigo(Long.valueOf(8));
           mun.setNomeIbge("salvo por repository");

           dao.save(mun);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        return "index";
	} 

}
