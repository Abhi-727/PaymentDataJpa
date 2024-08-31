package com.org.serviceImpl;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.org.constant.TransactionStausEnum;
import com.org.dto.TransactionDto;
import com.org.repo.ITransactionRepo;
import com.org.service.PaymentService;
import com.org.service.factory.PaymentStatusFactory;
import com.org.service.interfaces.PaymentStatusHandler;

@Component 
public class PaymentStatusImpl implements PaymentService {
	

	@Autowired
	private PaymentStatusFactory statusfactory;
	
	
	
	@Override
	public String paymentStatus(TransactionDto payment) {
		  
		System.out.println("PaymentStatusImpl.paymentStatus()");
		
		
		String processhandler = CreatedTrasactionEnum(payment);
		
		return "returning from serviceimpl"+processhandler;
	}

	private String CreatedTrasactionEnum(TransactionDto payment) {
		
		TransactionStausEnum statusenum=TransactionStausEnum.getByName(payment.getTxnStatus());
		
		System.out.println("Transaction enum id : "+statusenum.getId() + "Transaction enum : "+statusenum.getName());
		
		PaymentStatusHandler statushandler= statusfactory.getStatusHandler(statusenum);
		
		//CreateStatusHandler handler=new CreateStatusHandler();
		
		String processhandler=statushandler.processStatus(payment);
		return processhandler;
	}

}
