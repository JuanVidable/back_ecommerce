package com.example.ecommerce.back_ecommerce.services.Impl;

import com.example.ecommerce.back_ecommerce.entities.ArticuloManufacturado;
import com.example.ecommerce.back_ecommerce.repositories.BaseRepository;
import com.example.ecommerce.back_ecommerce.services.ArticuloManufacturadoService;
import com.example.ecommerce.back_ecommerce.services.Base.BaseServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class ArticuloManufacturadoServiceImpl extends BaseServiceImpl<ArticuloManufacturado, Long> implements ArticuloManufacturadoService {
    public ArticuloManufacturadoServiceImpl(BaseRepository<ArticuloManufacturado, Long> baseRepository) {
        super(baseRepository);
    }
}
