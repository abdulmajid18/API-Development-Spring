package com.rozz.api.apidevelopment.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Objects;
import java.util.stream.StreamSupport;
import java.util.Collections;
import static java.util.stream.Collectors.toList;

import com.rozz.api.apidevelopment.dto.ProductRequest;
import com.rozz.api.apidevelopment.dto.ProductResponse;
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

    public List<ProductResponse> getAllProducts() {
        Iterable<ProductEntity> productEntities = repository.findAll();
        return toListModel(productEntities);
    }

    private ProductResponse mapToProduct(ProductEntity productEntity) {
        ProductResponse productResponse = new ProductResponse();
        productResponse.setId(productEntity.getId())
                .setName(productEntity.getName())
                .setDescription(productEntity.getDescription())
                .setCount(productEntity.getCount())
                .setPrice(productEntity.getPrice())
                .setImageUrl(productEntity.getImageUrl());

        return productResponse;
    }

    public List<ProductResponse> toListModel(Iterable<ProductEntity> entities) {
        if (Objects.isNull(entities)) {
            return Collections.emptyList();
        }

        return StreamSupport.stream(entities.spliterator(), false).map(this::mapToProduct).collect(toList());
    }

}
