package com.org.serviceImpl.Handler;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.org.dao.ITransactionDao;
import com.org.dto.TransactionDto;
import com.org.service.interfaces.PaymentStatusHandler;

@Component
public class CreateStatusHandler extends PaymentStatusHandler  {

	@Autowired
	private ITransactionDao txndao;
	


	@Override
	public String processStatus(TransactionDto payment) {
		
		System.out.println("CreateStatusHandler.processStatus()"+payment);
		
	String txncreated = txndao.createTransaction(payment);
	System.out.println("Transaction created from cstatusHandler : " + txncreated);
	
	
		
		return "returning from createStatusHandler() " + txncreated ;
	}

	
}
