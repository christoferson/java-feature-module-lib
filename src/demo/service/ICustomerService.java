package demo.service;

import demo.model.Customer;

public interface ICustomerService {

	Customer find(long id);
	
	Customer register(Customer account);
	
}
