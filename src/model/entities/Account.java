package model.entities;

import model.exceptions.DomainException;

public class Account {
	
	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;
	
	public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public Account() {
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
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

	public Double getBalance() {
		return balance;
	}
	
	public Double deposit(Double amount) {
		return balance =+ amount;
	}
	
	public Double withdraw(Double amount) throws DomainException {
		if(balance == 0 || amount > balance) {
			throw new DomainException("Not enough balance");
		}
		else if(amount > withdrawLimit) {
			throw new DomainException("The amount exceeds withdraw limit");
		}
		return balance =- amount;
	}
	 
	
	
	
	
	
	

}
