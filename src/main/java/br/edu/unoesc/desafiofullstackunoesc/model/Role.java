package br.edu.unoesc.desafiofullstackunoesc.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Role {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;  
    private String name;

    public Role(Long codigo, String name) {
        this.codigo = codigo;
        this.name = name;
    }

    public Role() {
    }
    
    public Long getId() {
        return codigo;
    }
    public void setId(Long codigo) {
        this.codigo = codigo;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }    
}
