package com.example.shopmoduleone;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class ShopService {
	
	
	@Autowired
	private ShopRepository repo;
	public List<Shop> listAll()
	{
	return repo.findAll();
	}
	public void save(Shop shop)
	{
	repo.save(shop);
	}
	public Shop get(Integer shop_id)
	{
	return repo.findById(shop_id).get();
	}
	public void delete(Integer shop_id)
	{
	repo.deleteById(shop_id);
	}
	
	
	

}
