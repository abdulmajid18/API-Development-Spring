package com.rozz.api.apidevelopment.service;

import com.rozz.api.apidevelopment.dto.ProductRequest;
import com.rozz.api.apidevelopment.dto.ProductResponse;
import java.util.List;
import java.util.Optional;

public interface ProductService {
    public void createProduct(ProductRequest productRequest);

    public List<ProductResponse> getAllProducts();

    public Optional<ProductResponse> getProductById(String id);
}
