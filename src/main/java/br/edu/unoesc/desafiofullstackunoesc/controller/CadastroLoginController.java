package br.edu.unoesc.desafiofullstackunoesc.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.unoesc.desafiofullstackunoesc.model.Usuario;
import br.edu.unoesc.desafiofullstackunoesc.service.UsuarioService;



@CrossOrigin
@Controller
public class CadastroLoginController {

    @Autowired
    UsuarioService usuarioService;

    @GetMapping("/cadastro")
	public String cadastronovo(Model model)
    {  
        model.addAttribute("usuario", new Usuario());      
        return "cadastro";
	}

    @PostMapping("/concluidocadastro")
	public String concluicadastro(Usuario usuario, Model model)
    {     
        model.addAttribute("usuario", new Usuario());
        try {
            usuarioService.salvaUsuario(usuario);    
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println("Erro ao salvar");
        }
        
        return "index";
	}
    
    // @GetMapping("/login")
	// public String login() {
	// 	return "login";
	// }
}
