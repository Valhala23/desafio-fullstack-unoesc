package br.edu.unoesc.desafiofullstackunoesc.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import br.edu.unoesc.desafiofullstackunoesc.dao.ClienteDto;
import br.edu.unoesc.desafiofullstackunoesc.model.Cliente;

@CrossOrigin
@Controller
public class ControleInicial {

    @Autowired  
    ClienteDto clidto = new ClienteDto();

    @GetMapping("/")
	public String indice()
    {        
        return "index";
	}       

    @GetMapping("/testeinsere")
	public String insereTeste()
    {     

        try {
            clidto.insere(); 
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        return "index";
	} 
    
    @GetMapping("/testesel")
	public String selecionaTeste()
    { 
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Clientes-PU");      
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        Cliente cliente = (Cliente)entityManager.find(Cliente.class, 1);
        System.out.println(cliente.getNome());

        entityManager.close();
        entityManagerFactory.close(); 

        return "index";
	} 
}
