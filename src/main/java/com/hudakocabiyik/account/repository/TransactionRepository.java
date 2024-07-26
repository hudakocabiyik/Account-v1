package com.hudakocabiyik.account.repository;

import com.hudakocabiyik.account.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction,String> {
}
