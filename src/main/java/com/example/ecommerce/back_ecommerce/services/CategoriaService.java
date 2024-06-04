package com.example.ecommerce.back_ecommerce.services;

import com.example.ecommerce.back_ecommerce.entities.Categoria;
import com.example.ecommerce.back_ecommerce.services.Base.BaseService;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CategoriaService extends BaseService<Categoria, Long> {
    List<Categoria> categoriaBySucursalId(Long id) throws Exception;
}
