package com.example.ecommerce.back_ecommerce.controller;

import com.example.ecommerce.back_ecommerce.controller.Base.BaseControllerImpl;
import com.example.ecommerce.back_ecommerce.entities.Categoria;
import com.example.ecommerce.back_ecommerce.services.CategoriaService;
import com.example.ecommerce.back_ecommerce.services.Impl.CategoriaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin( "*" )
@RequestMapping("/api/categorias")
public class CategoriaController extends BaseControllerImpl<Categoria, CategoriaServiceImpl> {
    @Autowired
    CategoriaService categoriaService;

    @GetMapping("/sucursal/{id}")
    public ResponseEntity<List<Categoria>> getCategoriasBySucursalId(@PathVariable Long id) throws Exception {

            return ResponseEntity.status(HttpStatus.OK).body(categoriaService.categoriaBySucursalId(id));

    }
}
