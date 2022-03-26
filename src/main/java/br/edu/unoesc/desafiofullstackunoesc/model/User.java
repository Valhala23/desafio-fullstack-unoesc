package br.edu.unoesc.desafiofullstackunoesc.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome_login;
    private String senha_login;
    private int permit;

    public User()
    {

    }

    public int getPermit() {
        return permit;
    }

    public void setPermit(int permit) {
        this.permit = permit;
    }

    public String getSenha_login() {
        return senha_login;
    }

    public void setSenha_login(String senha_login) {
        this.senha_login = senha_login;
    }

    public String getNome_login() {
        return nome_login;
    }

    public void setNome_login(String nome_login) {
        this.nome_login = nome_login;
    }

    public User(Long id, String nome_login, String senha_login, int permit)
    {
        this.id = id;
        this.setNome_login(nome_login);
        this.setSenha_login(senha_login);
        this.setPermit(permit);
    }
    
}
