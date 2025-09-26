package com.example.shopmoduleone;

import org.springframework.web.bind.annotation.RestController;
import java.util.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShopController 
{
	@Autowired
	private ShopService service;
	
	// RESTful API methods for Retrieval operations
	@GetMapping("/shop")
	public List<Shop> list()
	{
		return service.listAll();
	}
	
	@GetMapping("/shop/{shop_id}")
	public ResponseEntity<Shop> get(@PathVariable Integer shop_id)
	{
		try
		{
			Shop shop = service.get(shop_id);
			return new ResponseEntity<Shop>(shop, HttpStatus.OK);
		}
		
		catch (NoSuchElementException e)
		{
			return new ResponseEntity<Shop>(HttpStatus.NOT_FOUND);
		}
	}
	
	// RESTful API method for Create operation
	@PostMapping("/shop")
	public void add(@RequestBody Shop shop)
	{
		service.save(shop);
	}
	
	// RESTful API method for Update operation
	@PutMapping("/shop/{shop_id}")
	public ResponseEntity<?> update(@RequestBody Shop shop, @PathVariable Integer shop_id)
	{
		try
		{
			Shop shop2 = service.get(shop_id);
			service.save(shop);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch (NoSuchElementException e)
		{
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	// RESTful API method for Delete operation
	@DeleteMapping("/shop/{shop_id}")
	public void delete(@PathVariable Integer shop_id)
	{
	service.delete(shop_id);
	}

}

