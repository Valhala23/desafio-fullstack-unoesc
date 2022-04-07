package br.edu.unoesc.desafiofullstackunoesc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import br.edu.unoesc.desafiofullstackunoesc.model.Usuario;
import br.edu.unoesc.desafiofullstackunoesc.repository.UsuarioRepository;
import br.edu.unoesc.desafiofullstackunoesc.security.MyUserDetails;
 
public class UserDetailsServiceImpl implements UserDetailsService {
 
    @Autowired
    private UsuarioRepository userRepository;
     
    @Override
    public UserDetails loadUserByUsername(String username)
            throws UsernameNotFoundException {
        Usuario user = userRepository.findByLogin(username);
         
        if (user == null) {
            throw new UsernameNotFoundException("Could not find user");
        }
         
        return new MyUserDetails(user);
    }
 
}