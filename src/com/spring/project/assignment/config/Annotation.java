package com.spring.project.assignment.config;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.project.assignment.human.HumanProperties;
import com.spring.project.assignment.human.Human;

public class Annotation {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext
			context = new ClassPathXmlApplicationContext("ConfigAnnotation.xml"); 
		
		Human person = context.getBean("humanProperties", Human.class);
		HumanProperties orang1 = (HumanProperties) person;
		
		
		System.out.println("===== Ini Annotation =====");
		System.out.println("Nama : "+orang1.getNama());
		System.out.println("Tempat Tanggal Lahir : " + orang1.getTtl());
		System.out.println("Jenis Kelamin : " + orang1.getJk());
		System.out.println("Alamat : " + orang1.getAlamat());
		System.out.println("Tinggi(cm) : " + orang1.getTinggi());
		System.out.println("Berat(kg) : " + orang1.getBerat());
		
		context.close();
	}
}
