package com.everis.bankproduct.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.everis.bankproduct.domain.ProductBank;


public interface ProductBankRepository extends ReactiveMongoRepository<ProductBank, String>{

}
