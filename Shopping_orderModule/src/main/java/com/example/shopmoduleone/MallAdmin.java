package com.example.shopmoduleone;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class MallAdmin 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer malladmin_id;
	
	private String malladmin_name;
	private String malladmin_password;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Mall malladmin_mall;
	
	private Integer malladmin_phone;
	
	
	
	public Integer getMalladmin_id() {
		return malladmin_id;
	}
	public void setMalladmin_id(Integer malladmin_id) {
		this.malladmin_id = malladmin_id;
	}
	public String getMalladmin_name() {
		return malladmin_name;
	}
	public void setMalladmin_name(String malladmin_name) {
		this.malladmin_name = malladmin_name;
	}
	public String getMalladmin_password() {
		return malladmin_password;
	}
	public void setMalladmin_password(String malladmin_password) {
		this.malladmin_password = malladmin_password;
	}
	public Mall getMalladmin_mall() {
		return malladmin_mall;
	}
	public void setMalladmin_mall(Mall malladmin_mall) {
		this.malladmin_mall = malladmin_mall;
	}
	public Integer getMalladmin_phone() {
		return malladmin_phone;
	}
	public void setMalladmin_phone(Integer malladmin_phone) {
		this.malladmin_phone = malladmin_phone;
	}
	
	
	public MallAdmin(Integer malladmin_id, String malladmin_name, String malladmin_password, Mall malladmin_mall,
			Integer malladmin_phone) {
		super();
		this.malladmin_id = malladmin_id;
		this.malladmin_name = malladmin_name;
		this.malladmin_password = malladmin_password;
		this.malladmin_mall = malladmin_mall;
		this.malladmin_phone = malladmin_phone;
	}
	
	
	
	public MallAdmin() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public String toString() {
		return "MallAdmin [malladmin_id=" + malladmin_id + ", malladmin_name=" + malladmin_name
				+ ", malladmin_password=" + malladmin_password + ", malladmin_mall=" + malladmin_mall
				+ ", malladmin_phone=" + malladmin_phone + "]";
	}
	
	
	
	
}


