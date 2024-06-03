package com.example.ecommerce.back_ecommerce.entities;

import jakarta.persistence.Entity;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@SuperBuilder
public class ArticuloManufacturado extends Base {
    private String descripcion;

}
