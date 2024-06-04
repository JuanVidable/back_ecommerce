package com.example.ecommerce.back_ecommerce.services.Impl;

import com.example.ecommerce.back_ecommerce.entities.ArticuloInsumo;
import com.example.ecommerce.back_ecommerce.repositories.BaseRepository;
import com.example.ecommerce.back_ecommerce.services.ArticuloInsumoService;
import com.example.ecommerce.back_ecommerce.services.Base.BaseServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class ArticuloInsumoServiceImpl extends BaseServiceImpl<ArticuloInsumo, Long> implements ArticuloInsumoService {
    public ArticuloInsumoServiceImpl(BaseRepository<ArticuloInsumo, Long> baseRepository) {
        super(baseRepository);
    }
}
