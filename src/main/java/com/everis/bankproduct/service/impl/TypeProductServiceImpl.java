package com.everis.bankproduct.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.bankproduct.domain.TypeProductBank;
import com.everis.bankproduct.repository.TypeProductRepository;
import com.everis.bankproduct.service.TypeProductService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
@Service
public class TypeProductServiceImpl implements TypeProductService{

	@Autowired
	TypeProductRepository typeProductRepo;
	
	@Override
	public Mono<TypeProductBank> save(TypeProductBank typeProductBank) {
		return this.typeProductRepo.save(typeProductBank);
	}

	@Override
	public Flux<TypeProductBank> findAll() {
		return this.typeProductRepo.findAll();
	}

	@Override
	public Mono<TypeProductBank> findById(String id) {
		return this.typeProductRepo.findById(id);
	}

	@Override
	public Mono<Void> deletexId(String id) {
		return this.typeProductRepo.deleteById(id);
	}

	@Override
	public Mono<Void> delete(TypeProductBank typeProductBank) {
		return this.typeProductRepo.delete(typeProductBank);
	}

}
