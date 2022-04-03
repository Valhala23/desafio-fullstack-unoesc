package br.edu.unoesc.desafiofullstackunoesc.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PatchMapping;

import br.edu.unoesc.desafiofullstackunoesc.model.Municipio;
import br.edu.unoesc.desafiofullstackunoesc.model.Usuario;
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

    @GetMapping("/cadastro")
	public String cadastronovo(Model model)
    {  
        model.addAttribute("usuario", new Usuario());      
        return "cadastro";
	}

    @PatchMapping("/concluidocadastro")
	public String concluicadastro(@ModelAttribute("usuario") Usuario usuario, Model model)
    {     
        model.addAttribute("usuario", new Usuario());
        usuarioService.salvaUsuario(usuario);
        return "/";
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
