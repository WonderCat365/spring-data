package com.myfirstproject.repositories;

import com.myfirstproject.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PersonRepository extends JpaRepository<Person, Long>, CustomInterface {
    public List<Person> findAll();
}
