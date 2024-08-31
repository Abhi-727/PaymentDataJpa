package com.org.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Data
@Entity
@Table(name = "Transaction")
public class TransactionEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
    private Integer userId;
    private Integer paymentMethodId;
    private Integer providerId;
    private Integer paymentTypeId;
    private Integer txnStatusId;
    
    private double amount;
    private String currency;
    private String merchantTransactionReference;
    private String txnReference;
   
    
}
