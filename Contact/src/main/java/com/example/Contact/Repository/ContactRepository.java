package com.example.Contact.Repository;
import com.example.Contact.Entity.ContactEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ContactRepository extends JpaRepository<ContactEntity ,Integer> {

}
