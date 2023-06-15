package com.CustomCode_10.services;


import java.util.List;

import com.CustomCode_10.entities.Customer;


public interface CustomerService {

	public void saveCustomer(Customer customer);

	public List<Customer> getCustomer();

	public void deleteById(Long id);

	public Customer updateCustomer(long id);

	public Customer getCustomerInfo(long id);



}
