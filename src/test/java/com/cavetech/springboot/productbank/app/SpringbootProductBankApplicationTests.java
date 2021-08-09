package com.cavetech.springboot.productbank.app;

import com.everis.bankproduct.service.impl.ProductBankServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.reactive.server.WebTestClient;

import com.everis.bankproduct.domain.ProductBank;
import com.everis.bankproduct.domain.TypeProductBank;
import com.everis.bankproduct.service.ProductBankService;

import reactor.core.publisher.Mono;

import java.util.Collections;
import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
class SpringbootProductBankApplicationTests {

	@Test
	void contextLoads() {
	}

}
