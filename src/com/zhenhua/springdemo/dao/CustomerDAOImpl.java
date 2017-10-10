package com.zhenhua.springdemo.dao;

import java.util.List;

//import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
//import org.springframework.transaction.annotation.Transactional;

import com.zhenhua.springdemo.entity.Customer;
@Repository
public class CustomerDAOImpl implements CustomerDAO {

	@Autowired 
	private SessionFactory sessionFactory;
	@Override
	public List<Customer> getCustomers() {
		// TODO Auto-generated method stub
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Customer> theQuery = currentSession.createQuery("from Customer order by lastName", Customer.class);
		List<Customer> customers = theQuery.getResultList();
				
		return customers;
	}
	@Override
	public Object saveCustomer(Customer theCustomer) {
		// TODO Auto-generated method stub
		Session currentSession = sessionFactory.getCurrentSession();
		
		currentSession.save(theCustomer);		
		return null;
	}
	@Override
	public Customer getCustomer(int theId) {
		// TODO Auto-generated method stub
		Session currentSession = sessionFactory.getCurrentSession();
		Customer theCustomer = currentSession.get(Customer.class, theId);
		return theCustomer;
	}

}
