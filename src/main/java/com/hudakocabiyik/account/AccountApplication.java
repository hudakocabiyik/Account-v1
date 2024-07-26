package com.hudakocabiyik.account;

import com.hudakocabiyik.account.model.Account;
import com.hudakocabiyik.account.model.Customer;
import com.hudakocabiyik.account.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.time.Clock;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.UUID;
import java.util.function.Supplier;

@SpringBootApplication
public class AccountApplication implements CommandLineRunner {
	private final CustomerRepository customerRepository;

	public AccountApplication(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	public static void main(String[] args) {SpringApplication.run(AccountApplication.class, args);}

	@Override
	public void run(String... args) throws Exception {

	}
	@ConditionalOnProperty(
			prefix = "command.line.runner",
			value = "enabled",
			havingValue= "true",
			matchIfMissing = true
	)


	@Component
	public class CommandLineTaskExecutor implements CommandLineRunner {
		@Bean
		public Clock clock() {
			return Clock.systemUTC();
	}
	    @Bean
		public Supplier<UUID> uuidSupplier(){return UUID::randomUUID;}

		@Override
		public void run(String... args) throws Exception {

		}
	}




	}




