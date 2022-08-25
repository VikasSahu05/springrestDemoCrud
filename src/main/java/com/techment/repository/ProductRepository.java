package com.techment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techment.entity.Product;

public interface ProductRepository extends JpaRepository<Product,Integer>{

	Product findByName(String name);

//	void save();
	

}
