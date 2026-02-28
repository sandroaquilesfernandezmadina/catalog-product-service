package org.stockify.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.stockify.Entity.Product;
import org.stockify.Repository.ProductRepository;
import org.stockify.dto.ProductRequest;
import org.stockify.dto.ProductResponse;
import org.stockify.exeption.ResourceNotFountExeption;
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
    public ProductResponse findById(Integer id) {
        Product  product = productRepository.findById(id)
                .orElseThrow(()->
                      new ResourceNotFountExeption("Producto no encontrado con el id: " + id));


        return productMapper.toResponse(product);
    }

    @Override
    public ProductResponse save(ProductRequest request) {
        Product product = productMapper.toEntity(request);
        Product guardado = productRepository.save(product);
        return productMapper.toResponse(guardado);
    }

    @Override
    public ProductResponse update(Integer id, ProductRequest request) {
        Product  product = productRepository.findById(id)
                .orElseThrow(()->
                        new ResourceNotFountExeption("Producto no encontrado con el id: " + id));

         product.setNombre(request.getNombre());
         product.setDescripcion(request.getDescricion());
         product.setPrecio(request.getPrecio());

         Product actualizado = productRepository.save(product);
        return productMapper.toResponse(actualizado);
    }

    @Override
    public void delete(Integer id) {
        productRepository.deleteById(id);
    }
}
