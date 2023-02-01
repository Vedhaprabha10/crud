package com.example.Contact.Servcie;

import com.example.Contact.Dto.ContactDto;
import com.example.Contact.Entity.ContactEntity;

public interface ContactService {
    ContactEntity update (ContactDto contactDto);
}
