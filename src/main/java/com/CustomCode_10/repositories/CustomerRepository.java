package com.CustomCode_10.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.CustomCode_10.entities.Customer;
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
