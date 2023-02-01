package org.example.Service;

import org.example.Entity.PersonEntity;

import java.util.ArrayList;

public class PersonService {

        public ArrayList<PersonEntity> getInfo(){
        PersonEntity person1 = new PersonEntity();
        person1.setId(101);
        person1.setFirstname("Virat");
        person1.setLastname("Kohli");
        person1.setAddress("Delhi");
        person1.setEmail("vk18@gmail.com");
        person1.setPhoneNo(9876543210L);

        PersonEntity person2 = new PersonEntity();
        person2.setId(102);
        person2.setFirstname("Kane");
        person2.setLastname("Williamson");
        person2.setAddress("Hyderabad");
        person2.setEmail("kw19@gmail.com");
        person2.setPhoneNo(9123456780L);

        PersonEntity person3 = new PersonEntity();
        person3.setId(103);
        person3.setFirstname("Suresh");
        person3.setLastname("Raina");
        person3.setAddress("Chennai");
        person3.setEmail("src03@gmail.com");
        person3.setPhoneNo(7865489555L);

            ArrayList<PersonEntity> person =new ArrayList<>();
            person.add(person1);
            person.add(person2);
            person.add(person3);
            return person;
        }
}
