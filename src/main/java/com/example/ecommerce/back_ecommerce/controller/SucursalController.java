package com.example.ecommerce.back_ecommerce.controller;

import com.example.ecommerce.back_ecommerce.controller.Base.BaseControllerImpl;
import com.example.ecommerce.back_ecommerce.entities.Sucursal;
import com.example.ecommerce.back_ecommerce.services.Impl.SucursalServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin( "*" )
@RequestMapping("/api/sucursales")
public class SucursalController extends BaseControllerImpl<Sucursal, SucursalServiceImpl> {
}
