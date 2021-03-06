package com.everis.bankproduct.service.impl;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Service;

import com.everis.bankproduct.domain.ProductBank;
import com.everis.bankproduct.repository.ProductBankRepository;
import com.everis.bankproduct.service.ProductBankService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
@Service
public class ProductBankServiceImpl implements ProductBankService {

	@Autowired
	private ProductBankRepository prodbankRepo;
	
	
	@Override
	public Mono<ProductBank> save(ProductBank productBank) {
		
		return this.prodbankRepo.save(productBank);
	}

	

	@Override
	public Flux<ProductBank> findAll() {
		return this.prodbankRepo.findAll();
		
	}

	@Override
	public Mono<ProductBank> findById(String id) {
		return this.prodbankRepo.findById(id);
	}

	@Override
	public Mono<Void> deletexId(String id) {
		return this.prodbankRepo.deleteById(id);
	}

	@Override
	public Mono<Void> delete(ProductBank productBank) {
		return this.prodbankRepo.delete(productBank);
	}

}
