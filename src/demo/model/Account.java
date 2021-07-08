package demo.model;

import java.math.BigDecimal;

public class Account {

	private long id;
	
	private BigDecimal balance = BigDecimal.ZERO;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public BigDecimal getBalance() {
		return balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return String.format("Account [id=%s, balance=%s]", id, balance);
	}

}
