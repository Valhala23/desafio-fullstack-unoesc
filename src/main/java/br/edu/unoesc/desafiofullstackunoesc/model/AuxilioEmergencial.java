package br.edu.unoesc.desafiofullstackunoesc.model;

import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AuxilioEmergencial {
    
    @Id
    private Long codigo;    
    @Column(name = "dataconsulta")
    private Date dataConsulta;
    // Municipio
    @Column(name = "numeroparcela")
    private String numeroParcela;
    @Column(name = "valortotal")
    private BigDecimal valorTotal;
    
    public AuxilioEmergencial(Long codigo, Date dataConsulta, String numeroParcela, BigDecimal valorTotal) {
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

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    
}
