package br.edu.unoesc.desafiofullstackunoesc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cliente {
    @Id
    private Integer id;
    @Column(name = "nome")
    private String nome;
    
    public Cliente(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
    }
    
    public Cliente() {
    }
    public Integer getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    
}
