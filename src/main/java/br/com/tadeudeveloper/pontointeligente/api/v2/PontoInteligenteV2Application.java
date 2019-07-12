package br.com.tadeudeveloper.pontointeligente.api.v2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class PontoInteligenteV2Application {

	public static void main(String[] args) {
		SpringApplication.run(PontoInteligenteV2Application.class, args);
	}

}
