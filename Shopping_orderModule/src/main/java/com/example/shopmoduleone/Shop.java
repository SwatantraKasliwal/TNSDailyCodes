package com.example.shopmoduleone;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Shop 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer shop_id;
	private String shop_category;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Employee shop_employeeid;
	
	private String shop_name;
	private String shop_customers;
	private String shop_status;
	
	@OneToOne(cascade = CascadeType.ALL)
	private ShopOwner shop_owner;
	
	private String shop_leasestatus;
	
	
	public Integer getShop_id() {
		return shop_id;
	}
	public void setShop_id(Integer shop_id) {
		this.shop_id = shop_id;
	}
	public String getShop_category() {
		return shop_category;
	}
	public void setShop_category(String shop_category) {
		this.shop_category = shop_category;
	}
	public Employee getShop_employeeid() {
		return shop_employeeid;
	}
	public void setShop_employeeid(Employee shop_employeeid) {
		this.shop_employeeid = shop_employeeid;
	}
	public String getShop_name() {
		return shop_name;
	}
	public void setShop_name(String shop_name) {
		this.shop_name = shop_name;
	}
	public String getShop_customers() {
		return shop_customers;
	}
	public void setShop_customers(String shop_customers) {
		this.shop_customers = shop_customers;
	}
	public String getShop_status() {
		return shop_status;
	}
	public void setShop_status(String shop_status) {
		this.shop_status = shop_status;
	}
	public ShopOwner getShop_owner() {
		return shop_owner;
	}
	public void setShop_owner(ShopOwner shop_owner) {
		this.shop_owner = shop_owner;
	}
	public String getShop_leasestatus() {
		return shop_leasestatus;
	}
	public void setShop_leasestatus(String shop_leasestatus) {
		this.shop_leasestatus = shop_leasestatus;
	}
	
	public Shop(Integer shop_id, String shop_category, Employee shop_employeeid, String shop_name,
			String shop_customers, String shop_status, ShopOwner shop_owner, String shop_leasestatus) {
		super();
		this.shop_id = shop_id;
		this.shop_category = shop_category;
		this.shop_employeeid = shop_employeeid;
		this.shop_name = shop_name;
		this.shop_customers = shop_customers;
		this.shop_status = shop_status;
		this.shop_owner = shop_owner;
		this.shop_leasestatus = shop_leasestatus;
	}
	
	public Shop() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Shop [shop_id=" + shop_id + ", shop_category=" + shop_category + ", shop_employeeid=" + shop_employeeid
				+ ", shop_name=" + shop_name + ", shop_customers=" + shop_customers + ", shop_status=" + shop_status
				+ ", shop_owner=" + shop_owner + ", shop_leasestatus=" + shop_leasestatus + "]";
	}
	
	
}