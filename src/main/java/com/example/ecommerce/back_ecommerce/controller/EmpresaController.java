package com.example.ecommerce.back_ecommerce.controller;

import com.example.ecommerce.back_ecommerce.controller.Base.BaseControllerImpl;
import com.example.ecommerce.back_ecommerce.entities.Empresa;
import com.example.ecommerce.back_ecommerce.services.Impl.EmpresaServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin( "*" )
@RequestMapping("/api/empresas")
public class EmpresaController extends BaseControllerImpl<Empresa, EmpresaServiceImpl> {
}
