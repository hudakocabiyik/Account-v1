package com.hudakocabiyik.account.repository;

import com.hudakocabiyik.account.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CustomerRepository extends JpaRepository<Customer,String> {

}
