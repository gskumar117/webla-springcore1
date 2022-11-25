package com.webla.product.repos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.webla.product.entity.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer> {

}
