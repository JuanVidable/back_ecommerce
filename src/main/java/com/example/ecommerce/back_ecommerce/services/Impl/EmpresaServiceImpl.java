package com.example.ecommerce.back_ecommerce.services.Impl;

import com.example.ecommerce.back_ecommerce.entities.Empresa;
import com.example.ecommerce.back_ecommerce.repositories.BaseRepository;
import com.example.ecommerce.back_ecommerce.services.Base.BaseServiceImpl;
import com.example.ecommerce.back_ecommerce.services.EmpresaService;
import org.springframework.stereotype.Service;

@Service
public class EmpresaServiceImpl extends BaseServiceImpl<Empresa, Long> implements EmpresaService {

    public EmpresaServiceImpl(BaseRepository<Empresa, Long> baseRepository) {
        super(baseRepository);
    }
}
