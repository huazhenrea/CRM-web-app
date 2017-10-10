package com.zhenhua.springdemo.service;

import java.util.List;

import com.zhenhua.springdemo.entity.Customer;

public interface CustomerService {

	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);

	public Customer getCustomer(int theId);
}
