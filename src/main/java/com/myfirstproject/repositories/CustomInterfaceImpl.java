package com.myfirstproject.repositories;

import com.myfirstproject.entities.Person;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

// Важно, чтобы в имени класса был постфикс Impl
public class CustomInterfaceImpl implements CustomInterface {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Person someCustomMethod() {
        String get = "FROM Person P WHERE P.id = 1";
        return (Person) entityManager.createQuery(get).getSingleResult();
    }
}
