package com.example.ecommerce.back_ecommerce.services.Impl;

import com.example.ecommerce.back_ecommerce.entities.Categoria;
import com.example.ecommerce.back_ecommerce.repositories.BaseRepository;
import com.example.ecommerce.back_ecommerce.repositories.CategoriaRepository;
import com.example.ecommerce.back_ecommerce.services.Base.BaseServiceImpl;
import com.example.ecommerce.back_ecommerce.services.CategoriaService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaServiceImpl extends BaseServiceImpl<Categoria, Long> implements CategoriaService {
    public CategoriaServiceImpl(BaseRepository<Categoria, Long> baseRepository) {
        super(baseRepository);
    }
    @Autowired
    CategoriaRepository categoriaRepository;
    @Override
    @Transactional
    public List<Categoria> categoriaBySucursalId(Long id) throws Exception{
        try{
            List<Categoria> categorias = categoriaRepository.findWithSucursalesById(id);
            return categorias;
        } catch(Exception e) {
            throw new Exception(e.getMessage());
        }
    }


}
