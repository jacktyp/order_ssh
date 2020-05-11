package cn.edu.nyist.service.impl;

import java.util.List;

import cn.edu.nyist.dao.ProductDAO;
import cn.edu.nyist.pojo.Product;
import cn.edu.nyist.service.ProductService;

public class ProductServiceImpl implements ProductService {

	ProductDAO productDAO;

	public List<Product> list() {
		List<Product> products = productDAO.list();
//		if(products.isEmpty()){
//			for (int i = 0; i < 5; i++) {
//				Product p = new Product();
//				p.setName("product " + i);
//				productDAO.add(p);
//				products.add(p);
//			}
//		}
		return products;
	}

	public ProductDAO getProductDAO() {
		return productDAO;
	}

	public void setProductDAO(ProductDAO productDAO) {
		this.productDAO = productDAO;
	}

	@Override
	public void add(Product p) {
		productDAO.add(p);
		
	}



	@Override
	public void update(Product p) {
		productDAO.update(p);
	}

	@Override
	public void delete(Product p) {
		productDAO.delete(p);
	}

	@Override
	public Product get(int id) {
		return productDAO.get(id);
	}

	
}
