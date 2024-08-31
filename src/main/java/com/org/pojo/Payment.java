package com.org.pojo;

import lombok.Data;

@Data
public class Payment {

	private String email;
	private String name;
	private double amount;
	private String currency;
	private String paymentmethod;	//card or onlinepay
	private String paymentType;		//Onetimepay or subscription
	private String providerId;		//? stripe or paypal
	
	
	
	
	
}
