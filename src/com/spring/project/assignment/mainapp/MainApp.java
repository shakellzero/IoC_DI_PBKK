package com.spring.project.assignment.mainapp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.spring.project.assignment.human.*;

public class MainApp {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(Config.class);
		
		Human person = context.getBean("orang1", Human.class);
		HumanProperties orang1 = (HumanProperties) person;
		
		System.out.println("===== Ini Java Config =====");
		System.out.println("Nama : "+orang1.getNama());
		System.out.println("Tempat Tanggal Lahir : " + orang1.getTtl());
		System.out.println("Jenis Kelamin : " + orang1.getJk());
		System.out.println("Alamat : " + orang1.getAlamat());
		System.out.println("Tinggi(cm) : " + orang1.getTinggi());
		System.out.println("Berat(kg) : " + orang1.getBerat());
		
		
		context.close();
	}

}
