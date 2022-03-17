package model.entities;

public class Account {
	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;
	
	public Account() {
		
	}

	public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.withdrawLimit = withdrawLimit;
		this.balance=balance;
	}

	// function type GETTERs and SETTERs
	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}
	
	public Double getBalance() {
		return balance;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}
	
	// methods
	
	public void deposit(double amount) {
	      balance+=amount;
	}
	
	private void validateWithdraw(double amount) {
		if (amount>withdrawLimit)
			throw new RuntimeException("Withdraw error: the amount exceeds withdraw limt");
		if( amount>balance)
			throw new RuntimeException("Withdraw error: No enough balance");
		
	}
	
	public void withdraw(double amount) {
		validateWithdraw(amount);
		balance-=amount;
	}
	
	
}
