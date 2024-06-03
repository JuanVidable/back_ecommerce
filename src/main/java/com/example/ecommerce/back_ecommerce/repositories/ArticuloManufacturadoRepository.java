package com.example.ecommerce.back_ecommerce.repositories;

import com.example.ecommerce.back_ecommerce.entities.ArticuloManufacturado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticuloManufacturadoRepository extends JpaRepository<ArticuloManufacturado, Long> {
}
