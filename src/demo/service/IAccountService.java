package demo.service;

import java.math.BigDecimal;

import demo.model.Account;

public interface IAccountService {

	boolean matches(String type);
	
	Account find(long id);
	
	Account register(Account account);
	
	Account deposit(long id, BigDecimal amount);
	
	Account withraw(long id, BigDecimal amount);
	
}
