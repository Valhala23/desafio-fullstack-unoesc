package br.edu.unoesc.desafiofullstackunoesc.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Cliente {
    @Id
    private Long id;
    private String nome;
    
    public Cliente() {
        
    }

    public Cliente(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setId(Long id) {
        this.id = id;
    }
    
}
