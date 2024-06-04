package com.example.ecommerce.back_ecommerce.controller;

import com.example.ecommerce.back_ecommerce.controller.Base.BaseControllerImpl;
import com.example.ecommerce.back_ecommerce.entities.PromocionDetalle;
import com.example.ecommerce.back_ecommerce.services.Impl.PromocionDetalleServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin( "*" )
@RequestMapping("/api/promociones-detalles")
public class PromocionDetalleController extends BaseControllerImpl<PromocionDetalle, PromocionDetalleServiceImpl> {
}
