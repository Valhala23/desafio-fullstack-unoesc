package br.edu.unoesc.desafiofullstackunoesc.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class HibernateDao {

    @Autowired
    private SessionFactory sessionFactory;

    // ...
}