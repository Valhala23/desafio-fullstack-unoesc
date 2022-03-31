package br.edu.unoesc.desafiofullstackunoesc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UnidadeFederativa {
    @Id
    private Integer id;
    @Column(name = "codigo")
    private Long codigo;    
    @Column(name = "sigla")
    private String sigla;    
    @Column(name = "nome")
    private String nome;
    
    
    public UnidadeFederativa(Integer id, Long codigo, String sigla, String nome) {
        this.id = id;
        this.codigo = codigo;
        this.sigla = sigla;
        this.nome = nome;
    }


    public UnidadeFederativa() {
    }


    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }


    public Long getCodigo() {
        return codigo;
    }


    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }


    public String getSigla() {
        return sigla;
    }


    public void setSigla(String sigla) {
        this.sigla = sigla;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    
}
