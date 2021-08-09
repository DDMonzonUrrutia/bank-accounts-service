package com.everis.bankproduct.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.everis.bankproduct.domain.TypeProductBank;


public interface TypeProductRepository  extends ReactiveMongoRepository<TypeProductBank, String>{

}
