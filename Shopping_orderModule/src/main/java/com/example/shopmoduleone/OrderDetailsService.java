package com.example.shopmoduleone;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
@Transactional
public class OrderDetailsService 
{
	@Autowired
	private OrderDetailsRepository repo;
	
	public List<OrderDetails> listAll()
	{
		return repo.findAll();
	}
	
	public void save(OrderDetails orderdetails)
	{
		repo.save(orderdetails);
	}
	
	public OrderDetails get(Integer orderdetails_id)
	{
		return repo.findById(orderdetails_id).get();
	}
	public void delete(Integer orderdetails_id)
	{
		repo.deleteById(orderdetails_id);
	}
}

