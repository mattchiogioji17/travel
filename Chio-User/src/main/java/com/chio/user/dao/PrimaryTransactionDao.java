package com.chio.user.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.chio.user.domain.PrimaryTransaction;

public interface PrimaryTransactionDao extends CrudRepository<PrimaryTransaction, Long> {

    List<PrimaryTransaction> findAll();
}
