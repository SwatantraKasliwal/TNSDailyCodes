package com.example.shopmoduleone;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class MallAdminService 
{
	@Autowired
	private MallAdminRepository repo;
	
	public List<MallAdmin> listAll()
	{
		return repo.findAll();
	}
	
	public void save(MallAdmin malladmin)
	{
		repo.save(malladmin);
	}
	
	public MallAdmin get(Integer malladmin_id)
	{
		return repo.findById(malladmin_id).get();
	}
	public void delete(Integer malladmin_id)
	{
		repo.deleteById(malladmin_id);
	}
}

