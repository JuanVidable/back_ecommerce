package com.example.ecommerce.back_ecommerce.services.Impl;

import com.example.ecommerce.back_ecommerce.entities.Pedido;
import com.example.ecommerce.back_ecommerce.repositories.BaseRepository;
import com.example.ecommerce.back_ecommerce.services.Base.BaseServiceImpl;
import com.example.ecommerce.back_ecommerce.services.PedidoService;
import org.springframework.stereotype.Service;

@Service
public class PedidoServiceImpl extends BaseServiceImpl<Pedido, Long> implements PedidoService {
    public PedidoServiceImpl(BaseRepository<Pedido, Long> baseRepository) {
        super(baseRepository);
    }
}
