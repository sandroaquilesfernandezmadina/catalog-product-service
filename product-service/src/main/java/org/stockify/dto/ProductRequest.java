package org.stockify.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductRequest {
    private String nombre;
    private String descricion;
    private Double precio;
}
