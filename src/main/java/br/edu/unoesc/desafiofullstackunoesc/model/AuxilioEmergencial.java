package br.edu.unoesc.desafiofullstackunoesc.model;

import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

import com.google.gson.annotations.SerializedName;

@Entity
public class AuxilioEmergencial {
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @SerializedName(value="id", alternate="codigo")
    private Long codigo;    
    @Column(name = "dataconsulta")
    private Date dataConsulta;
    // Municipio
    @SerializedName(value="numeroParcela", alternate="parcela")
    @Column(name = "numeroparcela")
    private String numeroParcela;
    @Column(name = "valortotal")
    @SerializedName(value="valor", alternate="valorTotal")
    private double valorTotal;
    @SerializedName(value="mesDisponibilizacao", alternate="mesano")
    @Transient String dataAux;    
    
    public AuxilioEmergencial(Long codigo, Date dataConsulta, String numeroParcela, double valorTotal) {
        this.codigo = codigo;
        this.dataConsulta = dataConsulta;
        this.numeroParcela = numeroParcela;
        this.valorTotal = valorTotal;
    }

    public AuxilioEmergencial() {
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public Date getDataConsulta() {
        return dataConsulta;
    }

    public void setDataConsulta(Date dataConsulta) {
        this.dataConsulta = dataConsulta;
    }

    public String getNumeroParcela() {
        return numeroParcela;
    }

    public void setNumeroParcela(String numeroParcela) {
        this.numeroParcela = numeroParcela;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getDataAux() {
        return dataAux;
    }

    public void setDataAux(String dataAux) {
        this.dataAux = dataAux;
    }

    
}
