package demo.service.impl;

import java.util.ResourceBundle;

import demo.service.ICustomerService;
import demo.service.jpa.CustomerServiceJpa;

public class CustomerServiceFactory {
	
	private static final ResourceBundle RESOURCE = ResourceBundle.getBundle("demo.service.impl.service"); 

	public static ICustomerService provider() {
		String type = RESOURCE.getString("customer.service.type");
		if ("jpa".equals(type)) {
			return new CustomerServiceJpa();
		}
		throw new IllegalArgumentException();
	}
	
}
