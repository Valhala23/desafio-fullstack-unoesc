package br.edu.unoesc.desafiofullstackunoesc.service;

import java.lang.reflect.Type;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.unoesc.desafiofullstackunoesc.model.AuxilioEmergencial;
import br.edu.unoesc.desafiofullstackunoesc.repository.AuxilioEmRepository;

@Service
public class BeneficioService 
{
    @Autowired
    AuxilioEmRepository auxRepo;
    public String persisteBeneficio(List<AuxilioEmergencial> listaAux){
        String resultado = "Não foi possivel salvar";
        for (AuxilioEmergencial auxilio : listaAux) {
            
            try {
                
                //auxilio.setDataConsulta(new SimpleDateFormat("dd/MM/yyyy").parse(auxilio.getDataAux()));
                auxRepo.save(auxilio);
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }           

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

                Type listOfMyClassObject = new TypeToken<ArrayList<AuxilioEmergencial>>() {}.getType();            
                Gson gson = new Gson();
                List<AuxilioEmergencial> outputList = gson.fromJson(lista, listOfMyClassObject);

                
            } catch (Exception e) {
                System.out.println("Erro no mapeamento" + e.getMessage());
            }
        //}

        return listaAuxilo;
    }
}