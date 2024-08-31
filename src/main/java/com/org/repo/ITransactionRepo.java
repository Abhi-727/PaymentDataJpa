package com.org.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.org.entity.TransactionEntity;

public interface ITransactionRepo extends JpaRepository<TransactionEntity, Integer>{

}
