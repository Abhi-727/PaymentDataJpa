package com.org.dao;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import com.org.dto.TransactionDto;
import com.org.entity.TransactionEntity;
import com.org.repo.ITransactionRepo;

@Component
public class TransactionDaoImpl implements ITransactionDao {

	@Autowired
	private ITransactionRepo transactionrepo;

	@Autowired
	private ModelMapper mapper;

	@Override
	public String createTransaction(TransactionDto txnDTO) {

		System.out.println("TransactionDaoImpl.createTransaction() : received txnDto : " + txnDTO);

		TransactionEntity txnEntity = mapper.map(txnDTO, TransactionEntity.class);
		System.out.println("converted into entity : " + txnEntity);

		//save transaction entity into DB
		TransactionEntity saveEntity =	transactionrepo.save(txnEntity);
		System.out.println("Transaction entity is saved in DB " + saveEntity.getId());

		return "Returning from DAO with saved amount : " + saveEntity.getAmount();
	}

}
