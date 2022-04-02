package br.edu.unoesc.desafiofullstackunoesc.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import br.edu.unoesc.desafiofullstackunoesc.model.Cliente;
import br.edu.unoesc.desafiofullstackunoesc.repository.ClienteRepository;



@CrossOrigin
@Controller
public class ControleInicial {

    //@Autowired
    ClienteRepository clienteRepo;

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
           Cliente cli = new Cliente();
           cli.setId(Long.valueOf(78));
           cli.setNome("salvo por repository");

           //clienteRepo.save(cli);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        return "index";
	} 

    // @GetMapping("/testeinf")
	// public String insereUfTeste()
    // {     

    //     try {
    //         ufDao.insere(); 
    //     }catch(Exception e){
    //         System.out.println(e.getMessage());
    //     }

    //     return "index";
	// } 
    
    // @GetMapping("/testesel")
	// public String selecionaTeste()
    // { 
    //     try {
    //        // clidao.seleciona(); 
    //     }catch(Exception e){
    //         System.out.println(e.getMessage());
    //     }

    //     return "index";
	// } 
}
