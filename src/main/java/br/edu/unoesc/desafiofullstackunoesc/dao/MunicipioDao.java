package br.edu.unoesc.desafiofullstackunoesc.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.stereotype.Service;

import br.edu.unoesc.desafiofullstackunoesc.model.Cliente;
import br.edu.unoesc.desafiofullstackunoesc.model.Municipio;

@Service
public class MunicipioDao  {

    public void insere(){
            // Teste inserção

    EntityManagerFactory entityManagerFactory 
        = Persistence.createEntityManagerFactory("Clientes-PU");
    EntityManager entityManager = entityManagerFactory.createEntityManager();
    Cliente cliente = new Cliente();    
    cliente.setId(54);
    cliente.setNome("Permanecer banco dao");

    entityManager.getTransaction().begin();
    entityManager.persist(cliente);
    entityManager.getTransaction().commit();

    entityManager.close();
    entityManagerFactory.close();
    }

    public void seleciona(){
        EntityManagerFactory entityManagerFactory 
            = Persistence.createEntityManagerFactory("Clientes-PU");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        Municipio municipio = entityManager.find(Municipio.class, 1);
        System.out.println(municipio.getNome());

        entityManager.close();
        entityManagerFactory.close(); 

    }
}
