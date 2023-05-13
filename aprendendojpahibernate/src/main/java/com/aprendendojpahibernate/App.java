package com.aprendendojpahibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Dominio.Pessoa;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Pessoa p1 = new Pessoa(0 , "samuel", "samuel@gmail.com");
        Pessoa p2 = new Pessoa(0 , "raissa", "raissa@gmail.com");
        Pessoa p3 = new Pessoa(0 , "samira", "samira@gmail.com");

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpa");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        
        entityManager.getTransaction().begin();
        entityManager.persist(p1);
        entityManager.persist(p2);
        entityManager.persist(p3);
        entityManager.getTransaction().commit();
        
        System.out.println("Pronto!!");
    }
}
