package cn.edu.nyist.service;

import java.util.List;

import cn.edu.nyist.pojo.Product;

public interface ProductService {
	
	public List<Product> list();
	public void add(Product p);
	public Product get(int id);
	public void update(Product p);
	public void delete(Product p);
}
