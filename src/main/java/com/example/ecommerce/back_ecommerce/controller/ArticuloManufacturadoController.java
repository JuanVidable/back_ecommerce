package com.example.ecommerce.back_ecommerce.controller;

import com.example.ecommerce.back_ecommerce.controller.Base.BaseControllerImpl;
import com.example.ecommerce.back_ecommerce.entities.ArticuloManufacturado;
import com.example.ecommerce.back_ecommerce.services.ArticuloInsumoService;
import com.example.ecommerce.back_ecommerce.services.ArticuloManufacturadoService;
import com.example.ecommerce.back_ecommerce.services.Impl.ArticuloInsumoServiceImpl;
import com.example.ecommerce.back_ecommerce.services.Impl.ArticuloManufacturadoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin( "*" )
@RequestMapping("/api/articulos-manufacturados")
public class ArticuloManufacturadoController extends BaseControllerImpl<ArticuloManufacturado, ArticuloManufacturadoServiceImpl> {


}
