package com.example.shopmoduleone;

import javax.persistence.Entity; 
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Entity;

import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class OrderDetails 
{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer orderdetails_id;
	private LocalDateTime orderdetails_dateofpurchase;
	private Float orderdetails_total;
	
	@OneToOne(mappedBy = "orderdetails")
	private Customer orderdetails_customerid;
	
	private String orderdetails_paymentmodel;
	private Integer orderdetails_shopid;
	
	
	
	public Integer getOrderdetails_id() {
		return orderdetails_id;
	}
	public void setOrderdetails_id(Integer orderdetails_id) {
		this.orderdetails_id = orderdetails_id;
	}
	public LocalDateTime getOrderdetails_dateofpurchase() {
		return orderdetails_dateofpurchase;
	}
	public void setOrderdetails_dateofpurchase(LocalDateTime orderdetails_dateofpurchase) {
		this.orderdetails_dateofpurchase = orderdetails_dateofpurchase;
	}
	public Float getOrderdetails_total() {
		return orderdetails_total;
	}
	public void setOrderdetails_total(Float orderdetails_total) {
		this.orderdetails_total = orderdetails_total;
	}
	public Customer getOrderdetails_customerid() {
		return orderdetails_customerid;
	}
	public void setOrderdetails_customerid(Customer orderdetails_customerid) {
		this.orderdetails_customerid = orderdetails_customerid;
	}
	public String getOrderdetails_paymentmodel() {
		return orderdetails_paymentmodel;
	}
	public void setOrderdetails_paymentmodel(String orderdetails_paymentmodel) {
		this.orderdetails_paymentmodel = orderdetails_paymentmodel;
	}
	public Integer getOrderdetails_shopid() {
		return orderdetails_shopid;
	}
	public void setOrderdetails_shopid(Integer orderdetails_shopid) {
		this.orderdetails_shopid = orderdetails_shopid;
	}
	
	
	
	public OrderDetails(Integer orderdetails_id, LocalDateTime orderdetails_dateofpurchase, Float orderdetails_total,
			Customer orderdetails_customerid, String orderdetails_paymentmodel, Integer orderdetails_shopid) {
		super();
		this.orderdetails_id = orderdetails_id;
		this.orderdetails_dateofpurchase = orderdetails_dateofpurchase;
		this.orderdetails_total = orderdetails_total;
		this.orderdetails_customerid = orderdetails_customerid;
		this.orderdetails_paymentmodel = orderdetails_paymentmodel;
		this.orderdetails_shopid = orderdetails_shopid;
	}
	
	public OrderDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public String toString() {
		return "OrderDetails [orderdetails_id=" + orderdetails_id + ", orderdetails_dateofpurchase="
				+ orderdetails_dateofpurchase + ", orderdetails_total=" + orderdetails_total
				+ ", orderdetails_customerid=" + orderdetails_customerid + ", orderdetails_paymentmodel="
				+ orderdetails_paymentmodel + ", orderdetails_shopid=" + orderdetails_shopid + "]";
	}
	
	
	

}

