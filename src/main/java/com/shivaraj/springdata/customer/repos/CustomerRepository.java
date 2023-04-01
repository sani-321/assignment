package com.shivaraj.springdata.customer.repos;

import org.springframework.data.repository.CrudRepository;

import com.shivaraj.springdata.customer.entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {

}
