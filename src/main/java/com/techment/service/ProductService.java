package com.techment.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techment.entity.Product;
import com.techment.repository.ProductRepository;

/**
 * @author 🆅🅸🅺🅰🆂
 *
 */
@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repository;
	
	public Product saveProduct(Product product) {
		return repository.save(product);
	}
	
	public List<Product> saveProducts(List<Product> products) {
		return repository.saveAll(products);
	}
	
	public List<Product> getProducts(){
		return repository.findAll(); 
	}
	
	public Product getProductById(int id){
		return repository.findById(id).orElse(null);
	}
	
	public Product getProductByName(String name){
		return repository.findByName(name); 
	}
	
	public String deleteProduct(int id) {
		 repository.deleteById(id);
		return "Product Removed !!"+id;
	}
	
	/*
	 * @Authod: Vikas Kumar Sahu
	 * @Description : this method is used to update the product by giving the product id
	 * @param :It  takes id and product as a parameter
	 * @return : it return products
	 * @created Date :25 Aug 2022
	 * 
	 * */
	
	public Product updateProduct(Product product) {
		Product existingProduct = repository.findById(product.getId()).orElse(null);
		existingProduct.setName(product.getName());
		existingProduct.setQuantity(product.getQuantity());
		existingProduct.setPrice(product.getPrice());
		return repository.save(existingProduct); 
	}
	
	
}
