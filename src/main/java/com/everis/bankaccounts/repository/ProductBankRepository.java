package com.everis.bankaccounts.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.everis.bankaccounts.domain.ProductBank;


public interface ProductBankRepository extends ReactiveMongoRepository<ProductBank, String>{

}
