package br.edu.unoesc.desafiofullstackunoesc.controller;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import br.edu.unoesc.desafiofullstackunoesc.dao.ClienteDto;

@CrossOrigin
@Controller
public class BeneficioController {

    @Autowired  
    ClienteDto clidto = new ClienteDto();

    @GetMapping("/consultabeneficios")
	public String consultaaux()
    {        
        return "consulta";
	} 

    @GetMapping("/beneficio")
    public String auxilio(
        @RequestParam(value = "codIbge", required = false) String codIbge,
        @RequestParam(value = "chaveApi", required = false) String chaveApi,
        @RequestParam(value = "data", required = false) String data,
        @RequestParam(value = "id", required = false) Integer id,
        Model model
    ) {
        String url = "https://api.github.com/users/Valhala23/repos";
        RestTemplate restTemplate = new RestTemplate();
        Object[] repos = restTemplate.getForObject(url, Object[].class);
        model.addAttribute("repositorios", repos);

        return "resultadoconsulta";
    }

}