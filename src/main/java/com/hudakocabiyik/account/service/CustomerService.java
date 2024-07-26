package com.hudakocabiyik.account.service;

import com.hudakocabiyik.account.dto.CustomerDto;
import com.hudakocabiyik.account.dto.CustomerDtoConverter;
import com.hudakocabiyik.account.exception.CustomerNotFoundException;
import com.hudakocabiyik.account.model.Customer;
import com.hudakocabiyik.account.repository.CustomerRepository;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class CustomerService {
    private final CustomerRepository customerRepository;
    private final CustomerDtoConverter converter;

    public CustomerService(CustomerRepository customerRepository, CustomerDtoConverter converter) {
        this.customerRepository = customerRepository;
        this.converter = converter;
    }

    protected Customer findCustomerById(String id) {
        Optional<Customer> customerOptional = customerRepository.findById(id);
        return customerOptional.orElseThrow(
                () -> new CustomerNotFoundException("Customer could not find by id: " + id));
    }

    public CustomerDto getCustomerById(String customerId) {
        return converter.convertToCustomerDto(findCustomerById(customerId));
    }
}
