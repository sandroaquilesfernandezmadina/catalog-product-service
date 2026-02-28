package org.stockify.controller;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
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



}
