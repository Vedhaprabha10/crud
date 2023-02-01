package org.example.Controller;

import org.example.Entity.PersonEntity;
import org.example.Service.PersonService;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class PersonController {

    public static void main(String[] args) {

        PersonService person = new PersonService();

       ArrayList<PersonEntity> personDetails = person.getInfo();
       ArrayList<PersonEntity> Name = (ArrayList<PersonEntity>) personDetails.stream().filter(n-> n.getFirstname()== n.getFirstname()).collect(Collectors.toList());
       Name.forEach(x-> System.out.println(x.getAddress()));
    }
}

