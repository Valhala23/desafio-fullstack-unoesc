package br.edu.unoesc.desafiofullstackunoesc.service;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.springframework.stereotype.Service;

import br.edu.unoesc.desafiofullstackunoesc.mapeamento.BeneficioMapeamento;
import br.edu.unoesc.desafiofullstackunoesc.model.AuxilioEmergencial;

@Service
public class BeneficioService 
{
    public String persisteBeneficio(){
        String resultado = "Não foi possivel salvar";

        return resultado;
    }

    public List<AuxilioEmergencial> mapear(String lista) {
        List<AuxilioEmergencial> listaAuxilo;        
        listaAuxilo = null;
        
        // Percorrer lista para ver as informações que encontro
        // for (String obj : lista.split("}},")) {
        //     System.out.println(obj.toString());
            try {

                Type listOfMyClassObject = new TypeToken<ArrayList<BeneficioMapeamento>>() {}.getType();            
                Gson gson = new Gson();
                List<BeneficioMapeamento> outputList = gson.fromJson(lista, listOfMyClassObject);

                
            } catch (Exception e) {
                System.out.println("Erro no mapeamento" + e.getMessage());
            }
        //}

        return listaAuxilo;
    }
}