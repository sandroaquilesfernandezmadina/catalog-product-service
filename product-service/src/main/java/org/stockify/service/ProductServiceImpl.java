package org.stockify.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.stockify.Repository.ProductRepository;
import org.stockify.dto.ProductRequest;
import org.stockify.dto.ProductResponse;
import org.stockify.mapper.ProductMapper;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {


    private final ProductRepository productRepository;
    private  final ProductMapper productMapper;

    @Override
    public List<ProductResponse> findAll() {
        return  productRepository.findAll()
                .stream()
                .map(productMapper::toResponse)
                .collect(Collectors.toList());
    }

    @Override
    public ProductResponse findById(Long id) {
        return null;
    }

    @Override
    public ProductResponse save(ProductRequest request) {
        return null;
    }

    @Override
    public ProductResponse update(Long id, ProductRequest request) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
