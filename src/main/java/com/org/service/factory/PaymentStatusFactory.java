package com.org.service.factory;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import com.org.constant.TransactionStausEnum;
import com.org.service.interfaces.PaymentStatusHandler;
import com.org.serviceImpl.Handler.CreateStatusHandler;


@Component
public class PaymentStatusFactory {
	
	private static final int CREATED = 1;
	private static final int INITIATED = 2;
	@Autowired
	private ApplicationContext ctxt;

	public PaymentStatusHandler getStatusHandler(TransactionStausEnum statusenum) {
		
		
		switch(statusenum){
		case CREATED:
			if(statusenum.getId() == CREATED ) {
				
				System.out.println("created status for createstatushandler :"+statusenum);
				CreateStatusHandler createhandler= ctxt.getBean(CreateStatusHandler.class);
				
				System.out.println("got bean from Applicationcontext ");
				return createhandler;
			}
		case INITIATED:
			if(statusenum.getId() == INITIATED ) {
			System.out.println("initiated");
			return null ;
			}
			
		default:
			System.out.println("unable to find status ");
			return null;
		
		}
	
	}
}
