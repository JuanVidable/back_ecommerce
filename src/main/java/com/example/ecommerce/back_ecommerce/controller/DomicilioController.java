package com.example.ecommerce.back_ecommerce.controller;

import com.example.ecommerce.back_ecommerce.controller.Base.BaseControllerImpl;
import com.example.ecommerce.back_ecommerce.entities.Domicilio;
import com.example.ecommerce.back_ecommerce.services.Impl.DomicilioServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin( "*" )
@RequestMapping("/api/domicilios")
public class DomicilioController extends BaseControllerImpl<Domicilio, DomicilioServiceImpl> {
}
