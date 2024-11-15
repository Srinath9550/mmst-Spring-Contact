package com.mmst.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mmst.model.Contact;
import com.mmst.service.ContactService;

@RestController
@RequestMapping("/api/contacts")
public class ContactController {

	@Autowired
	ContactService  contactService;
	    	

    @PostMapping("/add")
    public Contact addContact(@RequestBody Contact contact) {
        Contact savedContact = contactService.saveContact(contact);
        return contactService.saveContact(contact);
    }
}