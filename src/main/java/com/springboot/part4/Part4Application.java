package com.springboot.part4;

import com.springboot.part4.service.GitApiServiceImpl;
import com.springboot.part4.wsdl.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.net.MalformedURLException;
import java.net.URL;

@SpringBootApplication
public class Part4Application {
	public static void main(String[] args) {
		SpringApplication.run(Part4Application.class, args);
		GitApiServiceImpl gitApiServiceImpl = new GitApiServiceImpl();
		//listing the Git api version
		System.out.println(gitApiServiceImpl.getGitApiVersion());
		//listing all my repos from Github
		System.out.println(gitApiServiceImpl.getAllGitRepos());
		//listing commits from project: Dice
		System.out.println(gitApiServiceImpl.getCommits());;
	}
//	@Bean
//	CommandLineRunner lookup() throws MalformedURLException {
//		URL url = new URL("http://localhost:9090/ws/countries.wsdl");
//
//		CountriesPortService employee_Service = new CountriesPortService(url);
//		CountriesPort employeeServiceProxy = employee_Service.getCountriesPortSoap11();
//
//		GetCountryRequest request = new GetCountryRequest();
//		request.setName("United Kingdom");
//
//		GetCountryResponse response = employeeServiceProxy.getCountry(request);
//
//		Currency currency = response.getCountry().getCurrency();
//		String capital = response.getCountry().getCapital();
//		int population = response.getCountry().getPopulation();
//
//
//		System.out.println(""+currency);
//		System.out.println(""+capital);
//		System.out.println(""+population);
//
//		return null;
//	}
}