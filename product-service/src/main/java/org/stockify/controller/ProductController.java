package org.stockify.controller;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.stockify.Entity.Product;
import org.stockify.dto.ProductRequest;
import org.stockify.dto.ProductResponse;
import org.stockify.service.ProductService;

import java.util.List;

@RestController
@RequestMapping("/api/producto")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @GetMapping
    ResponseEntity<List<ProductResponse>> findAll(){
        return ResponseEntity.ok(productService.findAll());
    }

   @GetMapping("/{id}")
   ResponseEntity <ProductResponse> findById(@PathVariable Integer id){
        return ResponseEntity.ok(productService.findById(id));
    }

    @PostMapping("/{guardar}")
    ResponseEntity <ProductResponse> save(@RequestBody ProductRequest request){
        return ResponseEntity.ok(productService.save(request));
    }

    @PutMapping("/{id}")
    ResponseEntity <ProductResponse> save(@PathVariable Integer id ,@RequestBody ProductRequest request){
        return ResponseEntity.ok(productService.update( id, request));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity <Void> delete(@PathVariable Integer id){
       productService.findById(id);
        return ResponseEntity.noContent().build();
    }
}
