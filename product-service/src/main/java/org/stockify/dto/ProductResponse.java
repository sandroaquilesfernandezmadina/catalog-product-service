package org.stockify.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class ProductResponse {
    private Integer idProducto;
    private String nombre;
    private String descripcion;
    private Double precio;
}
