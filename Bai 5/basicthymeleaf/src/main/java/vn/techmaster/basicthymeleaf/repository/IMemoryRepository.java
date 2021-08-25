package vn.techmaster.basicthymeleaf.repository;

import org.springframework.stereotype.Repository;

import vn.techmaster.basicthymeleaf.model.Person;

import java.util.ArrayList;
import java.util.List;

@Repository
public class IMemoryRepository {
    private ArrayList<Person> people;


    public IMemoryRepository(){
        people = new ArrayList<>(List.of(
                new Person("Trinh Minh Cuong", "Viet Nam", "27-11-1975", "male"),
                new Person("Jons David", "Usa", "02-08-1990", "male"),
                new Person("Yokochan", "Japan", "10-06-2000", "female"),
                new Person("Anna", "Rusia", "20-06-1999", "female"),
                new Person("Ziang", "China", "23-06-1996", "female"),
                new Person("pukathek", "Thailand", "19-03-1993", "male"),
                new Person("Jons David", "Usa", "02-08-1990", "male"),
                new Person("Yokochan", "Japan", "10-06-2000", "female"),
                new Person("Anna", "Rusia", "20-06-1999", "female"),
                new Person("Ziang", "China", "23-06-1996", "female")
        ));


    }

    //
    public List<Person> getPeople(){
        return  people;
    }
}
