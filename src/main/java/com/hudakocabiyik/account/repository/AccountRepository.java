package com.hudakocabiyik.account.repository;

import com.hudakocabiyik.account.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account,String> {

}
