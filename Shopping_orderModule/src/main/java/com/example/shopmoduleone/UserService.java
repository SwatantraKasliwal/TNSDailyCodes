package com.example.shopmoduleone;




import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UserService 
{
	@Autowired
	private UserRepository repo;
	
	public List<User> listAll()
	{
		return repo.findAll();
	}
	
	public void save(User user)
	{
		repo.save(user);
	}
	
	public User get(Integer user_id)
	{
		return repo.findById(user_id).get();
	}
	public void delete(Integer user_id)
	{
		repo.deleteById(user_id);
	}
}