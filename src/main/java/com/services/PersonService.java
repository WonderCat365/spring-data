package com.services;

import com.myfirstproject.entities.Person;
import com.myfirstproject.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.List;

/**
 *
 * @author wondercat
 */
@Component
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

//    @Transactional
    public void add(Person p) {
        personRepository.save(p);
    }

//    @Transactional
    public void addAll(Collection<Person> people) {
        for (Person p : people) {
            personRepository.save(p);
        }
    }

    public Person some(){
        return personRepository.someCustomMethod();
    }

//    @Transactional(readOnly = true)
    public List<Person> listAll() {
        return personRepository.findAll();
    }
}
