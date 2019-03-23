
package com.capgemini.file.model;

import java.io.Serializable;

public class BankAccount implements Serializable {

	private int accountId;
	private String accountHolderName;
	private String accountType;
	private double acountBalance;
	private transient DebitCard debitCard;

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public double getAcountBalance() {
		return acountBalance;
	}

	public void setAcountBalance(double acountBalance) {
		this.acountBalance = acountBalance;
	}

	public DebitCard getDebitCard() {
		return debitCard;
	}

	public void setDebitCard(DebitCard debitCard) {
		this.debitCard = debitCard;
	}

	public BankAccount(int accountId, String accountHolderName, String accountType, double acountBalance,
			DebitCard debitCard) {
		super();
		this.accountId = accountId;
		this.accountHolderName = accountHolderName;
		this.accountType = accountType;
		this.acountBalance = acountBalance;
		this.debitCard = debitCard;
	}

}
