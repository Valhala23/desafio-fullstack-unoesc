package br.edu.unoesc.desafiofullstackunoesc.service;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.unoesc.desafiofullstackunoesc.mapeamento.BeneficioMapeamento;
import br.edu.unoesc.desafiofullstackunoesc.model.AuxilioEmergencial;
import br.edu.unoesc.desafiofullstackunoesc.repository.AuxilioEmRepository;

@Service
public class BeneficioService 
{
    @Autowired
    AuxilioEmRepository auxRepo;
    public String persisteBeneficio(List<BeneficioMapeamento> listaAux){
        String resultado = "Não foi possivel salvar";
        for (BeneficioMapeamento beneficioMapeamento : listaAux) {
            System.out.println();   
        }

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