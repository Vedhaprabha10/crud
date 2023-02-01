package com.example.Contact.Servcie;

import com.example.Contact.Dto.ContactDto;
import com.example.Contact.Entity.ContactEntity;
import com.example.Contact.Repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactServiceImpl implements ContactService{
    @Autowired
    private ContactRepository repo;
    @Override
    public ContactEntity update(ContactDto contactDto) {
        ContactEntity contact = new ContactEntity();
        contact.setName(contactDto.getName());
        return repo.save(contact);
    }
}
