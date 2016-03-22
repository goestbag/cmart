package com.cmart.app.msn.dao;

import com.cmart.app.msn.entity.Product;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ProductDao extends PagingAndSortingRepository<Product, String>{ }