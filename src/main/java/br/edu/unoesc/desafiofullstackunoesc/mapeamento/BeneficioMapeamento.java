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
    
}
