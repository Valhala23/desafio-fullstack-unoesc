package br.edu.unoesc.desafiofullstackunoesc.controller;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import br.edu.unoesc.desafiofullstackunoesc.model.AuxilioEmergencial;
import br.edu.unoesc.desafiofullstackunoesc.service.BeneficioService;


@CrossOrigin
@Controller
public class BeneficioController {

    @Autowired
    BeneficioService beneficioService;

    @GetMapping("/consultabeneficios")
	public String consultaaux()
    {        
        return "consulta";
	} 

    @GetMapping("/repositorios")
    public String projetos(Model model) {
        String url = "https://api.github.com/users/Valhala23/repos";
        RestTemplate restTemplate = new RestTemplate();
        Object[] repos = restTemplate.getForObject(url, Object[].class);
        model.addAttribute("repositorios", repos);

        return "resultadoconsulta";
    }

    @GetMapping("/beneficio")
    public String auxilio(
        @RequestParam(value = "codIbge", required = false) String codIbge,
        @RequestParam(value = "data", required = false) String data,
        @RequestParam(value = "pg", required = false) Integer pg,
        Model model
    ) {
        String url = "https://api.portaldatransparencia.gov.br/api-de-dados/auxilio-emergencial-beneficiario-por-municipio?codigoIbge={ibge}&mesAno={mesano}&pagina%20=1";
        
        UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(url);
        Map<String, String> urlParams = new HashMap<>();
        urlParams.put("ibge", codIbge);
        urlParams.put("mesano", data);       
                
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        //Object[] auxs = restTemplate.patchForObject(url, entity, Object[].class);
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        headers.set("chave-api-dados", "c07b50fda5b4065168455533a1a1ebeb");
        HttpEntity request = new HttpEntity(headers);

        // make an HTTP GET request with headers
        ResponseEntity<String> response = restTemplate.exchange(
                builder.buildAndExpand(urlParams).toUri(),
                HttpMethod.GET,
                request,
                String.class);

        if (response.getStatusCode() == HttpStatus.OK) {
            System.out.println("Request Successful.");
            
        } else {
            System.out.println("Request Failed");
            System.out.println(response.getStatusCode());
        }
        // Tentativa de mapear

        List<AuxilioEmergencial> auxilios = new Gson().fromJson(response.getBody(), new TypeToken<List<AuxilioEmergencial>>() {}.getType());

        model.addAttribute("auxs", auxilios);
        //beneficioService.persisteBeneficio(auxilios);

        return "auxilio";
    }

}