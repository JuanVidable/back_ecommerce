package com.example.ecommerce.back_ecommerce.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.MappedSuperclass;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@ToString
@Setter
@SuperBuilder
@Inheritance(strategy = InheritanceType.JOINED)
public class Articulo extends Base {

    private String denominacion;
    private Double precioVenta;
    private boolean habilitado = true;
    private String codigo;

    // Omitir relaciones no necesarias
}
