package br.edu.unoesc.desafiofullstackunoesc.dto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.stereotype.Service;

import br.edu.unoesc.desafiofullstackunoesc.model.Cliente;

@Service
public class ClienteDto {

    public void insere(){
            // Teste inserção

    EntityManagerFactory entityManagerFactory 
        = Persistence.createEntityManagerFactory("Clientes-PU");
    EntityManager entityManager = entityManagerFactory.createEntityManager();
    Cliente cliente = new Cliente();    
    cliente.setId(44);
    cliente.setNome("Armazém teste insere");

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

        Cliente cliente = entityManager.find(Cliente.class, 1);
        System.out.println(cliente.getNome());

        entityManager.close();
        entityManagerFactory.close(); 

    }
}
