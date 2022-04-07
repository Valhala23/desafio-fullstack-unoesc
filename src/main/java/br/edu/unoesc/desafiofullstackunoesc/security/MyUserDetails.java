package br.edu.unoesc.desafiofullstackunoesc.security;

import java.util.Arrays;
import java.util.Collection;
 
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import br.edu.unoesc.desafiofullstackunoesc.model.Usuario;
 
public class MyUserDetails implements UserDetails {
 
    private Usuario user;
     
    public MyUserDetails(Usuario user) {
        this.user = user;
    }
 
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        SimpleGrantedAuthority authority = new SimpleGrantedAuthority(user.getRoles().toString());
        return Arrays.asList(authority);
    }
 
    @Override
    public String getPassword() {
        return user.getSenha();
    }
 
    @Override
    public String getUsername() {
        return user.getLogin();
    }
 
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }
 
    @Override
    public boolean isAccountNonLocked() {
        return true;
    }
 
    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }
 
    @Override
    public boolean isEnabled() {
        return true;
    }
 
}
