package com.everis.bankproduct.service;

import com.everis.bankproduct.domain.ProductBank;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ProductBankService {

	Mono<ProductBank> save(ProductBank productBank);



	Flux<ProductBank> findAll();

	Mono<ProductBank> findById(String id);

	Mono<Void> deletexId(String id);

	Mono<Void> delete(ProductBank productBank);

}
