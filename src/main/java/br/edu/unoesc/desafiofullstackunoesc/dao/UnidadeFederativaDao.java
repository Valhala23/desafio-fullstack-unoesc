package br.edu.unoesc.desafiofullstackunoesc.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.stereotype.Service;
import br.edu.unoesc.desafiofullstackunoesc.model.UnidadeFederativa;

@Service
public class UnidadeFederativaDao {

    public void insere(){
            // Teste inserção

    EntityManagerFactory entityManagerFactory 
        = Persistence.createEntityManagerFactory("Clientes-PU");
    EntityManager entityManager = entityManagerFactory.createEntityManager();
    UnidadeFederativa uf = new UnidadeFederativa();    
    uf.setId(20);
    uf.setCodigo((long) 42);
    uf.setNome("Permanecer unidade no banco dao");

    entityManager.getTransaction().begin();
    entityManager.persist(uf);
    entityManager.getTransaction().commit();

    entityManager.close();
    entityManagerFactory.close();
    }

    public void seleciona(){
        EntityManagerFactory entityManagerFactory 
            = Persistence.createEntityManagerFactory("Clientes-PU");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        UnidadeFederativa uf = entityManager.find(UnidadeFederativa.class, 1);
        System.out.println(uf.getNome());

        entityManager.close();
        entityManagerFactory.close(); 

    }
}
