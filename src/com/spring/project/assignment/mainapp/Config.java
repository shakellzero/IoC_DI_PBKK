package com.spring.project.assignment.mainapp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import com.spring.project.assignment.human.*;

@Configuration
@PropertySource("classpath:status.properties")
public class Config {
	
	@Bean
	public Human orang1(@Value("${person.Na}") String nama,
			 @Value("${person.Tl}") String ttl,
			 @Value("${person.Jk}")String jk,
			 @Value("${person.Al}") String alamat,
			 @Value("${person.Ti}") int tinggi,
			 @Value("${person.Bt}") int berat
			) {
		
		HumanProperties orang1 = new HumanProperties(nama, ttl, jk, alamat, tinggi, berat);
		return orang1;
	}
}
