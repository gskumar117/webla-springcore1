package com.webla.product.repos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.webla.product.entity.Product;

import java.util.List;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer> {

    List<Product> findByPriceGreaterThan(double price);
    List<Product> findByPriceBetween(double priceFrom, double priceTo);
    List<Product> findByNameAndPriceAndDesc(String name, double price, String desc);

}
