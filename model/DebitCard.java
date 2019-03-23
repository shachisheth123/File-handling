package com.capgemini.file.model;

import java.io.Serializable;

public class DebitCard  {
	private long cardNumber;
	private int cvv;
	private int expiryMonth;
	private int expiryYear;
	
	public DebitCard()
	{
		
		super();
	}
	
	public long getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(long cardNumber) {
		this.cardNumber = cardNumber;
	}
	public int getCvv() {
		return cvv;
	}
	public void setCvv(int cvv) {
		this.cvv = cvv;
	}
	public int getExpiryMonth() {
		return expiryMonth;
	}
	public void setExpiryMonth(int expiryMonth) {
		this.expiryMonth = expiryMonth;
	}
	public int getExpiryYear() {
		return expiryYear;
	}
	public void setExpiryYear(int expiryYear) {
		this.expiryYear = expiryYear;
	}
	public DebitCard(long cardNumber, int cvv, int expiryMonth, int expiryYear) {
		super();
		this.cardNumber = cardNumber;
		this.cvv = cvv;
		this.expiryMonth = expiryMonth;
		this.expiryYear = expiryYear;
	}

	
}
