package com.example.ecommerce.back_ecommerce.repositories;

import com.example.ecommerce.back_ecommerce.entities.Categoria;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoriaRepository extends BaseRepository<Categoria, Long> {
    @Query("SELECT c FROM Categoria c JOIN c.sucursales s WHERE s.id = :id")
    List<Categoria> findWithSucursalesById(@Param("id") Long id);
}
