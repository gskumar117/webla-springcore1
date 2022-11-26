package com.webla.product.controller;

import com.webla.product.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.webla.product.dto.ProductDto;
import com.webla.product.service.ProductService;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("product")
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@PostMapping
	public ResponseEntity<Integer> createProduct(@RequestBody ProductDto proDto) {
		int id = productService.saveProduct(proDto);
		return new ResponseEntity<>(id, HttpStatus.CREATED);
	}

	@PutMapping
	public ResponseEntity<String> updateProduct(@RequestBody ProductDto proDto) {
		String msg = productService.updateProduct(proDto);
		return new ResponseEntity<>(msg, HttpStatus.OK);
	}
	//product/all
	@GetMapping("/all")
	public ResponseEntity<List<Product>> getAllProducts() {
		return new ResponseEntity<>(productService.findAllProducts(), HttpStatus.OK);
	}

	@DeleteMapping
	public ResponseEntity<String> deleteProductById(@RequestParam(value = "productId", required = true) int productId) {
		String response = productService.deleteById(productId);
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
}
