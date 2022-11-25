package com.webla.product.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webla.product.dto.ProductDto;
import com.webla.product.entity.Product;
import com.webla.product.repos.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	
	public int saveProduct(ProductDto proDto) {
		
		Product product = new Product();
		product.setId(1001);
		product.setName(proDto.getName());
		product.setDesc(proDto.getDesc());
		product.setPrice(proDto.getPrice());
		
		Product productResponse = productRepository.save(product);
		return productResponse.getId();
	}
	
}
