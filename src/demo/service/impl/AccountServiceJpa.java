package demo.service.impl;

import java.math.BigDecimal;

import demo.model.Account;
import demo.service.IAccountService;

public class AccountServiceJpa implements IAccountService {

	@Override
	public Account find(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Account register(Account account) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Account deposit(long id, BigDecimal amount) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Account withraw(long id, BigDecimal amount) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean matches(String type) {
		return "jpa".equals(type);
	}

}
