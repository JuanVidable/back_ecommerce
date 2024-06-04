package com.example.ecommerce.back_ecommerce.services.Impl;

import com.example.ecommerce.back_ecommerce.entities.PromocionDetalle;
import com.example.ecommerce.back_ecommerce.repositories.BaseRepository;
import com.example.ecommerce.back_ecommerce.services.Base.BaseServiceImpl;
import com.example.ecommerce.back_ecommerce.services.PromocionDetalleService;
import org.springframework.stereotype.Service;

@Service
public class PromocionDetalleServiceImpl extends BaseServiceImpl<PromocionDetalle, Long> implements PromocionDetalleService {
    public PromocionDetalleServiceImpl(BaseRepository<PromocionDetalle, Long> baseRepository) {
        super(baseRepository);
    }
}
