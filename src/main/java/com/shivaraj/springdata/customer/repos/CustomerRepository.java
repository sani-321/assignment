package com.shivaraj.springdata.customer.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.shivaraj.springdata.customer.entity.Customer;



public interface CustomerRepository extends CrudRepository<Customer, Integer> {
	
	List<Customer>findByEmailAndName(String email, String name);
	List<Customer>findByEmailLike(String email);
	
	List<Customer>findByIdIn (List<Integer> ids);

}
