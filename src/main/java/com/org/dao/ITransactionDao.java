package com.org.dao;

import com.org.dto.TransactionDto;

public interface ITransactionDao {

	public String createTransaction(TransactionDto txnDTO);
}
