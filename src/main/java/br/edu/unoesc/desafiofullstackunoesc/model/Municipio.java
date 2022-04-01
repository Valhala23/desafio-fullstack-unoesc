package br.edu.unoesc.desafiofullstackunoesc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Municipio {
    @Id
    private Integer id;
    @Column(name = "codigo")
    private Long codigo;    
    @Column(name = "codigoibge")
    private Long codigoIbge;
    @Column(name = "nomeibge")
    private String nomeIbge;
    @Column(name = "codigoregiao")
    private String codigoRegiao;
    @Column(name = "nomeregiao")
    private String nomeRegiao;
    @Column(name = "pais")
    private String pais;        
    // UnidadeFederativa
    
    public Municipio(Integer id, Long codigo, Long codigoIbge, String nomeIbge, String codigoRegiao, String nomeRegiao,
            String pais, String nome) {
        this.id = id;
        this.codigo = codigo;
        this.codigoIbge = codigoIbge;
        this.nomeIbge = nomeIbge;
        this.codigoRegiao = codigoRegiao;
        this.nomeRegiao = nomeRegiao;
        this.pais = pais;
    }

    public Municipio() {
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

    public Long getCodigoIbge() {
        return codigoIbge;
    }

    public void setCodigoIbge(Long codigoIbge) {
        this.codigoIbge = codigoIbge;
    }

    public String getNomeIbge() {
        return nomeIbge;
    }

    public void setNomeIbge(String nomeIbge) {
        this.nomeIbge = nomeIbge;
    }

    public String getCodigoRegiao() {
        return codigoRegiao;
    }

    public void setCodigoRegiao(String codigoRegiao) {
        this.codigoRegiao = codigoRegiao;
    }

    public String getNomeRegiao() {
        return nomeRegiao;
    }

    public void setNomeRegiao(String nomeRegiao) {
        this.nomeRegiao = nomeRegiao;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
    
}
