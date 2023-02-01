package com.example.Contact.Controller;

import com.example.Contact.Dto.ContactDto;
import com.example.Contact.Entity.ContactEntity;
import com.example.Contact.Servcie.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactController {

    @Autowired
    private ContactService contactService;
    @PostMapping("/update")
    public ResponseEntity<?> registerContact(@RequestBody ContactDto contactDto){
        ContactEntity contact=contactService.update(contactDto);
    return ResponseEntity.status(HttpStatus.CREATED).body(contactDto);
    }
}
