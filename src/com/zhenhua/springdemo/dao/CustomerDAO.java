package com.zhenhua.springdemo.dao;

import java.util.List;

import com.zhenhua.springdemo.entity.Customer;

public interface CustomerDAO {
	public List<Customer> getCustomers();

	public Object saveCustomer(Customer theCustomer);

	public Customer getCustomer(int theId);
}
