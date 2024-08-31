package com.org.controller;

import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.dto.TransactionDto;

import com.org.pojo.Transaction;
import com.org.repo.ITransactionRepo;
import com.org.service.PaymentService;


@RestController
@RequestMapping("/v1/payment")
public class PaymentController {

	
	private PaymentService service;

	private ModelMapper mapper;

	// constructor injection
	public PaymentController(ModelMapper mapper, PaymentService service) {
		this.mapper = mapper;
		this.service = service;
	}

	@PostMapping("/pay")
	public String createpayment(@RequestBody Transaction transaction) {

		System.out.println("****payment process started***********");
	
		System.out.println(" :" + transaction);

		// using mapper
		TransactionDto txnDto = mapper.map(transaction, TransactionDto.class);

		System.out.println("Transaction after convertingdto :" + txnDto);

		String paymentinfo = service.paymentStatus(txnDto);

		System.out.println("Paymentcontroller : " + paymentinfo);

		return paymentinfo;
	}
}
