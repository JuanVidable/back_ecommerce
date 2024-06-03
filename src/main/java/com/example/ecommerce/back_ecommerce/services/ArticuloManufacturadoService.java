package com.example.ecommerce.back_ecommerce.services;

import com.example.ecommerce.back_ecommerce.entities.ArticuloManufacturado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.ecommerce.back_ecommerce.repositories.ArticuloManufacturadoRepository;

import java.util.List;

@Service
public class ArticuloManufacturadoService {

    @Autowired
    private ArticuloManufacturadoRepository articuloManufacturadoRepository;

    public List<ArticuloManufacturado> getArticuloManufacturado() {
        return articuloManufacturadoRepository.findAll();

    }
}