package br.edu.unoesc.desafiofullstackunoesc.mapeamento;

import java.util.Date;

import com.google.gson.annotations.SerializedName;

public class BeneficioMapeamento {
    
    @SerializedName(value="id", alternate="codigo")
    private int id;    
    @SerializedName(value="mesDisponibilizacao", alternate="mesano")
    private String mesDisponibilizacao;
    // Municipio
    @SerializedName(value="numeroParcela", alternate="parcela")
    private String numeroParcela;
    @SerializedName(value="valor", alternate="valorTotal")
    private double valor;

    public BeneficioMapeamento() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMesDisponibilizacao() {
        return mesDisponibilizacao;
    }

    public void setMesDisponibilizacao(String mesDisponibilizacao) {
        this.mesDisponibilizacao = mesDisponibilizacao;
    }

    public String getNumeroParcela() {
        return numeroParcela;
    }

    public void setNumeroParcela(String numeroParcela) {
        this.numeroParcela = numeroParcela;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
}
