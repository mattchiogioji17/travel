package com.chio.user.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.chio.user.domain.SavingsTransaction;

public interface SavingsTransactionDao extends CrudRepository<SavingsTransaction, Long> {

    List<SavingsTransaction> findAll();
}

