package com.example.shopmoduleone;


import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class ShopOwner 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer shopowner_id;
	private String shopowner_name;
	private LocalDate shopowner_dob;
	private String shopowner_address;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Shop shop_id;
	
	
	public Integer getShopowner_id() {
		return shopowner_id;
	}
	public void setShopowner_id(Integer shopowner_id) {
		this.shopowner_id = shopowner_id;
	}
	public String getShopowner_name() {
		return shopowner_name;
	}
	public void setShopowner_name(String shopowner_name) {
		this.shopowner_name = shopowner_name;
	}
	public LocalDate getShopowner_dob() {
		return shopowner_dob;
	}
	public void setShopowner_dob(LocalDate shopowner_dob) {
		this.shopowner_dob = shopowner_dob;
	}
	public String getShopowner_address() {
		return shopowner_address;
	}
	public void setShopowner_address(String shopowner_address) {
		this.shopowner_address = shopowner_address;
	}
	public Shop getShop_id() {
		return shop_id;
	}
	public void setShop_id(Shop shop_id) {
		this.shop_id = shop_id;
	}
	
	public ShopOwner(Integer shopowner_id, String shopowner_name, LocalDate shopowner_dob, String shopowner_address,
			Shop shop_id) {
		super();
		this.shopowner_id = shopowner_id;
		this.shopowner_name = shopowner_name;
		this.shopowner_dob = shopowner_dob;
		this.shopowner_address = shopowner_address;
		this.shop_id = shop_id;
	}
	
	
	public ShopOwner() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	@Override
	public String toString() {
		return "ShopOwner [shopowner_id=" + shopowner_id + ", shopowner_name=" + shopowner_name + ", shopowner_dob="
				+ shopowner_dob + ", shopowner_address=" + shopowner_address + ", shop_id=" + shop_id + "]";
	}
	
}

