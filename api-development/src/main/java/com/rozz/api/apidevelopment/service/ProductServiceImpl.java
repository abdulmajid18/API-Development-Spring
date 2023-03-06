package com.rozz.api.apidevelopment.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.rozz.api.apidevelopment.dto.ProductRequest;
import com.rozz.api.apidevelopment.entity.ProductEntity;
import com.rozz.api.apidevelopment.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

    private ProductRepository repository;

    private static final Logger log = LoggerFactory.getLogger(ProductServiceImpl.class);

    ProductServiceImpl(ProductRepository repository) {
        this.repository = repository;
    }

    public void createProduct(ProductRequest productRequest) {
        ProductEntity productEntity = new ProductEntity();

        productEntity.setName(productRequest.getName())
                .setDescription(productRequest.getDescription())
                .setPrice(productRequest.getPrice())
                .setCount(productRequest.getCount())
                .setImageUrl(productRequest.getImageUrl());
        repository.save(productEntity);

        log.info("Request for Creating Product Name: {}\n", productEntity.getName());

    }

}
