package com.rozz.api.apidevelopment.service;

import java.util.Optional;
import java.util.UUID;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import static java.util.stream.Collectors.toList;
import java.util.stream.StreamSupport;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.rozz.api.apidevelopment.dto.CustomerRequest;
import com.rozz.api.apidevelopment.dto.CustomerResponse;
import com.rozz.api.apidevelopment.entity.CustomerEntity;
import com.rozz.api.apidevelopment.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {
  private CustomerRepository repository;

  private static final Logger log = LoggerFactory.getLogger(CustomerServiceImpl.class);

  public CustomerServiceImpl(CustomerRepository repository) {
    this.repository = repository;
  }

  @Override
  public List<CustomerResponse> getAllCustomers() {
    Iterable<CustomerEntity> customers = repository.findAll();
    return toListModel(customers);
  }

  @Override
  public Optional<CustomerResponse> getCustomerById(String id) {
    return repository.findById(UUID.fromString(id)).map(this::mapToCustomer);
  }

  @Override
  public void deleteCustomerById(String id) {
    repository.deleteById(UUID.fromString(id));
  }

  private CustomerResponse mapToCustomer(CustomerEntity customerEntity) {
    CustomerResponse customer = new CustomerResponse();
    customer.setFirstName(customerEntity.getFirstName())
        .setLastName(customerEntity.getLastName())
        .setEmail(customerEntity.getEmail())
        .setUsername(customerEntity.getUsername())
        .setPhone(customerEntity.getPhone())
        .setUserStatus(customerEntity.getUserStatus());
    return customer;
  }

  public List<CustomerResponse> toListModel(Iterable<CustomerEntity> entities) {
    if (Objects.isNull(entities)) {
      return Collections.emptyList();
    }
    return StreamSupport.stream(entities.spliterator(), false).map(this::mapToCustomer).collect(toList());
  }

  public void createCustomer(CustomerRequest customerRequest) {
    CustomerEntity customerEntity = new CustomerEntity();

    customerEntity.setFirstName(customerRequest.getFirstName())
        .setLastName(customerRequest.getLastName())
        .setUsername(customerRequest.getUsername())
        .setEmail(customerRequest.getEmail())
        .setPassword(customerRequest.getPassword())
        .setPhone(customerRequest.getPhone());
    repository.save(customerEntity);
    log.info("Request for Creating customer Name: {}\n", customerEntity.getUsername());
  }

}
