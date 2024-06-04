package com.example.ecommerce.back_ecommerce.repositories;

import com.example.ecommerce.back_ecommerce.entities.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpresaRepository extends BaseRepository<Empresa, Long> {
}
