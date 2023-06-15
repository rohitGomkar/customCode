package com.CustomCode_10.services;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CustomCode_10.entities.Contact;
import com.CustomCode_10.repositories.ContactRepository;

@Service
public class ContactServiceImpl implements ContactService {

	@Autowired 
	private ContactRepository contactRepo;

	@Override
	public void saveContact(Contact contact) {
		contactRepo.save(contact);
	}

	@Override
	public List<Contact> getAllContact() {
		List<Contact> contact = contactRepo.findAll();
		return contact;
	}

	@Override
	public void deleteById(Long id) {
		contactRepo.deleteById(id);
	}

	@Override
	public Contact updateContact(long id) {
		Optional<Contact> findById = contactRepo.findById(id);
		Contact contact = findById.get();
		
		return contact;
	}

	@Override
	public Contact getContactInfo(long id) {
		Optional<Contact> findById = contactRepo.findById(id);
		Contact contact = findById.get();
		return contact;
	}

}
