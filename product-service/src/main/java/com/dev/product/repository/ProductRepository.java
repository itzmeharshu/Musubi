package com.dev.product.repository;

import com.dev.product.model.Product;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepository {
    private final List<Product> products = new ArrayList<>();

    public List<Product> findAll() { return products; }
    public void save(Product product) { products.add(product); }
}