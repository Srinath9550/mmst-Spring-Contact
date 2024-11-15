package com.mmst.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mmst.model.Contact;
import com.mmst.repo.ContactRepository;

@Service
public class ContactService {


	@Autowired
	  ContactRepository  contactRepository;
	    
	 
    public Contact saveContact(Contact contact) {
        return contactRepository.save(contact);
    }
}