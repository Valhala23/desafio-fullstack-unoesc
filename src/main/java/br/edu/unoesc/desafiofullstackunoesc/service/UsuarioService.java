package br.edu.unoesc.desafiofullstackunoesc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.unoesc.desafiofullstackunoesc.model.Usuario;
import br.edu.unoesc.desafiofullstackunoesc.repository.UsuarioRepository;

@Service
public class UsuarioService {
    @Autowired
    UsuarioRepository userRepo;

   public  Usuario salvaUsuario(Usuario usuario){
        return userRepo. save(usuario);
    }
}
;