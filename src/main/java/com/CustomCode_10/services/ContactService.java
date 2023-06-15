package com.CustomCode_10.services;

import java.util.List;

import com.CustomCode_10.entities.Contact;

public interface ContactService {

	public void saveContact(Contact contact);

	public List<Contact> getAllContact();

	public void deleteById(Long id);

	public Contact updateContact(long id);

	public Contact getContactInfo(long id);

}

