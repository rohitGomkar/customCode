package com.CustomCode_10.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.CustomCode_10.entities.Customer;
import com.CustomCode_10.repositories.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerRepository customerRepo;

	@Override
	public void saveCustomer(Customer customer) {
		customerRepo.save(customer);
	}

	@Override
	public List<Customer> getCustomer() {
		List<Customer> customer = customerRepo.findAll();
		return customer;
	}

	@Override
	public void deleteById(Long id) {
		customerRepo.deleteById(id);
	}

	@Override
	public Customer updateCustomer(long id) {
		Optional<Customer> findById = customerRepo.findById(id);
		Customer customer = findById.get();
		return customer;
	}

	@Override
	public Customer getCustomerInfo(long id) {
		Optional<Customer> findById = customerRepo.findById(id);
		Customer customer = findById.get();
		return customer;
		}

}
