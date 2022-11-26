package com.webla.product.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webla.product.dto.ProductDto;
import com.webla.product.entity.Product;
import com.webla.product.repos.ProductRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	
	public int saveProduct(ProductDto proDto) {
		Product product = new Product();
		product.setId(proDto.getId());
		product.setName(proDto.getName());
		product.setDesc(proDto.getDesc());
		product.setPrice(proDto.getPrice());
		Product productResponse = null;
		if(!productRepository.existsById(proDto.getId())){
			productResponse = productRepository.save(product);
		}else{
			productResponse = productRepository.findById(proDto.getId()).get();
		}
		return productResponse.getId();
	}

	public String updateProduct(ProductDto proDto) {
		Product product = new Product();
		product.setId(proDto.getId());
		product.setName(proDto.getName());
		product.setDesc(proDto.getDesc());
		product.setPrice(proDto.getPrice());

		if(productRepository.existsById(proDto.getId())){
			productRepository.save(product);
			return proDto.getId()+ " Updated Successfully";
		}else{
			return proDto.getId()+ " product not available";
		}
	}


	public List<Product> findAllProducts() {
		List<Product> products = new ArrayList<>();
		Iterable<Product> iterableProducts = productRepository.findAll();
		iterableProducts.forEach(e ->products.add(e));
		return products;
	}

	public String deleteById(int productId) {
		String message = "";
		if(productRepository.existsById(productId)){
			productRepository.deleteById(productId);
			message = productId + " Deleted";
		}else{
			message = productId + " Not found for deletion";
		}
		return message;
	}
}
