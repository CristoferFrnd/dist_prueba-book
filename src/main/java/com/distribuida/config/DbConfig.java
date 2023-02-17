package com.distribuida.config;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Produces;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

@ApplicationScoped
public class DbConfig {
    @Produces
    @ApplicationScoped
    public EntityManager entityManager() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("base");
        return emf.createEntityManager();
    }
}
