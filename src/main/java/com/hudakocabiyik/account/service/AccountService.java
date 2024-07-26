package com.hudakocabiyik.account.service;

import com.hudakocabiyik.account.dto.AccountDto;
import com.hudakocabiyik.account.dto.AccountDtoConverter;
import com.hudakocabiyik.account.dto.CreateAccountRequest;
import com.hudakocabiyik.account.model.Account;
import com.hudakocabiyik.account.model.Customer;
import com.hudakocabiyik.account.model.Transaction;
import com.hudakocabiyik.account.repository.AccountRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.jta.JtaTransactionManager;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Service
public class AccountService {
    private final AccountRepository accountRepository;
    private final CustomerService  customerService;

    private final AccountDtoConverter converter;
public AccountService(AccountRepository accountRepository,
                      CustomerService customerService,
                      AccountDtoConverter converter) {
this.accountRepository = accountRepository;
this.customerService = customerService;
this.converter = converter;}
    public AccountDto createAccount(CreateAccountRequest createAccountRequest) {
    Customer customer = customerService.findCustomerById(createAccountRequest.getCustomerId());
    Account account = new Account(customer,
            createAccountRequest.getInitialCredit(),
            LocalDateTime.now()
            );
    if(createAccountRequest.getInitialCredit().compareTo(BigDecimal.ZERO)>0){

        Transaction transaction = new Transaction(createAccountRequest.getInitialCredit(),account);
        account.getTransaction().add(transaction);

    }
    return converter.convert(accountRepository.save(account));
    }

}

