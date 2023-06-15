package com.CustomCode_10.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CustomCode_10.entities.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long> {

}
