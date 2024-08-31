package com.org.pojo;



import lombok.Data;


@Data
public class Transaction {

	private Integer id;
    private Integer userId;
    
    private String paymentMethod;
    private String provider;
    private String paymentType;
    private String txnStatus;
    
    private double amount;
    private String currency;
    private String merchantTransactionReference;
    private String txnReference;
   
}
