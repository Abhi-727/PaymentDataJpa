package com.org.service.interfaces;

import com.org.dto.TransactionDto;

public abstract class PaymentStatusHandler {

	public  abstract String processStatus(TransactionDto payment);
	
}
