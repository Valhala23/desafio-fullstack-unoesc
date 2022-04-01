package br.edu.unoesc.desafiofullstackunoesc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import br.edu.unoesc.desafiofullstackunoesc.dao.ClienteDao;
import br.edu.unoesc.desafiofullstackunoesc.dao.UnidadeFederativaDao;
@CrossOrigin
@Controller
public class ControleInicial {

    @Autowired  
    ClienteDao clidao = new ClienteDao();

    @Autowired  
    UnidadeFederativaDao ufDao = new UnidadeFederativaDao();

    @GetMapping("/")
	public String indice()
    {        
        return "index";
	}       

    @GetMapping("/testeinsere")
	public String insereTeste()
    {     

        try {
            clidao.insere(); 
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        return "index";
	} 

    @GetMapping("/testeinf")
	public String insereUfTeste()
    {     

        try {
            ufDao.insere(); 
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        return "index";
	} 
    
    @GetMapping("/testesel")
	public String selecionaTeste()
    { 
        try {
            clidao.seleciona(); 
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        return "index";
	} 
}
