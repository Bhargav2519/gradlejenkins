package com.example.customer.service;

import java.util.List;
import java.util.Optional;

import com.example.customer.model.CustomerAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.customer.model.Customer;
//import com.example.customer.repository.CustomerRepository;

@Service
public class CustomerService {
	/*@Autowired
	CustomerRepository customerRepository;
	

	public Customer createCustomer(Customer customer) {
		
		return customerRepository.save(customer);
	}


	public Optional<Customer> getById(Long id) {
		
		return customerRepository.findById(id);
	}*/
	public Customer getCustomer() {
		CustomerAddress a = new CustomerAddress(10L,"w","r","s","r",1);
		Customer c = new Customer(10L,"sai","o","@gmail",a);

		return c;

	}

}
