package org.stockify.mapper;

import org.springframework.stereotype.Component;
import org.stockify.Entity.Product;
import org.stockify.dto.ProductRequest;
import org.stockify.dto.ProductResponse;

@Component
public class ProductMapper {

    public Product toEntity (ProductRequest request){
        Product product = new Product();

        product.setNombre(request.getNombre());
        product.setDescripcion(request.getDescricion());
        product.setPrecio(request.getPrecio());
        return  product;
    }

    public ProductResponse toResponse(Product product){
        return new ProductResponse(
                product.getIdProducto(),
                product.getNombre(),
                product.getDescripcion(),
                product.getPrecio()
        );
    }

}
