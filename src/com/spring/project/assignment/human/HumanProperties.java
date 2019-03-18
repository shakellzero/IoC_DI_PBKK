package com.spring.project.assignment.human;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;



@Component
public class HumanProperties implements Human {
	private String ttl;
	private String nama;
	private String jk;
	private String alamat;
	private int tinggi;
	private int berat;
	
	
	public HumanProperties() {
		super();
	}
	
	@Autowired
	public HumanProperties(@Value("${person.Na}") String nama,
			 		 @Value("${person.Tl}") String ttl,
					 @Value("${person.Jk}")String jk,
					 @Value("${person.Al}") String alamat,
					 @Value("${person.Ti}") int tinggi,
					 @Value("${person.Bt}") int berat) 
					
	{		
		super();
		this.nama = nama;
		this.ttl = ttl;
		this.jk = jk;
		this.alamat = alamat;
		this.tinggi = tinggi;
		this.berat = berat;
		
	}
	
	
	public String getNama() {
		return nama;
	}
	
	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getTtl() {
		return ttl;
	}
	
	public void setTtl(String ttl) {
		this.ttl = ttl;
	}

	public String getJk() {
		return jk;
	}

	public void setJk(String jk) {
		this.jk = jk;
	}

	public String getAlamat() {
		return alamat;
	}

	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}

	public int getTinggi() {
		return tinggi;
	}

	public void setTinggi(int tinggi) {
		this.tinggi = tinggi;
	}

	public int getBerat() {
		return berat;
	}

	public void setBerat(int berat) {
		this.berat = berat;
	}

}
