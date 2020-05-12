package com.example.producingwebservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.net.URL;

@SpringBootApplication
public class ProducingWebServiceApplication {
	public static void main(String[] args) throws Exception{
		SpringApplication.run(ProducingWebServiceApplication.class, args);
		URL url = new URL("http://localhost:9090/ws/countries.wsdl");
		CountryRepository countryRepo = new CountryRepository();
		//Getting the currency
		System.out.println(countryRepo.findCountry("United Kingdom").getCurrency());
		//Getting the Capital
		System.out.println(countryRepo.findCountry("United Kingdom").getCapital());
		//Getting the Population
		System.out.println(countryRepo.findCountry("United Kingdom").getPopulation());
	}
}