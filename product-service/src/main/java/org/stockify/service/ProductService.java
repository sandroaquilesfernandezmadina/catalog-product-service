package org.stockify.service;


import org.stockify.dto.ProductRequest;
import org.stockify.dto.ProductResponse;

import java.util.List;

public interface ProductService {

    List<ProductResponse> findAll();
    ProductResponse findById(Integer id);
    ProductResponse save (ProductRequest request);
    ProductResponse update (Integer id, ProductRequest request);
    public void delete(Integer id);
}
