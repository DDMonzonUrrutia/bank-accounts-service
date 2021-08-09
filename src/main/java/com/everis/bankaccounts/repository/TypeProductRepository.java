package com.everis.bankaccounts.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.everis.bankaccounts.domain.TypeProductBank;


public interface TypeProductRepository  extends ReactiveMongoRepository<TypeProductBank, String>{

}
