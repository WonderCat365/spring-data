package com.myfirstproject;

import com.myfirstproject.entities.Person;
import com.services.PersonService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

/**
 * Hello world!
 */
public class App {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("Spring.xml");
        PersonService personService = context.getBean(PersonService.class);

        try {
            personService.addAll(Arrays.asList(
                    new Person(6, "1", "Belarus"),
                    new Person(2, "1", "Belarus"),
                    new Person(3, "2", "Belarus"),
                    new Person(4, "3", "Belarus"),
                    new Person(5, "4", "Russia")));
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
        for (Person p : personService.listAll()) {
            System.out.println(p);
        }
        // Метод some() доступен благодаря полиморфизму
        // PersonService содержит поле personRepository,
        // класс которого реализует интерфейс CustomInterface
        System.out.println(personService.some());
        context.close();
    }
}
