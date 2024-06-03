package com.example.ecommerce.back_ecommerce.controller;

import com.example.ecommerce.back_ecommerce.entities.ArticuloManufacturado;
import com.example.ecommerce.back_ecommerce.services.ArticuloManufacturadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/articulos-manufacturados")
public class ArticuloManufacturadoController {

    @Autowired
    private ArticuloManufacturadoService articuloManufacturadoService;

    @GetMapping()
    public List<ArticuloManufacturado> getArticuloManufacturado() {
        return articuloManufacturadoService.getArticuloManufacturado();
    }
}
