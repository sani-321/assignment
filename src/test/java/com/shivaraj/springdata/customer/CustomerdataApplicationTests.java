package com.shivaraj.springdata.customer;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.shivaraj.springdata.customer.entity.Customer;
import com.shivaraj.springdata.customer.repos.CustomerRepository;

@SpringBootTest
class CustomerdataApplicationTests {
	
	@Autowired
	CustomerRepository repository;

	@Test
	void contextLoads() {
	}
	
	@Test
	public void testCreate() {
		Customer customer = new Customer(1, "John", "john_doe@gmail.com");
		repository.save(customer);	
	}
	
	@Test
	public void testRead() {
		Customer customer = repository.findById(1).get();
		assertNotNull(customer);
		assertEquals("John", customer.getName());
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>"+ customer.getName());
	}
	
	@Test
	public void testUpdate() {
		Customer customer = repository.findById(1).get();
		customer.setName("Jane");
		repository.save(customer);
	}
	
	@Test
	public void testDelete() {
		if(repository.existsById(1)) {
			repository.deleteById(1);
		}
	}
	@Test 
	public void testCount() {
		System.out.println("Total records: " +repository.count());
	}
	

}
