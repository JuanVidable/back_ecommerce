package com.example.ecommerce.back_ecommerce.repositories;

import com.example.ecommerce.back_ecommerce.entities.Base;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public interface BaseRepository <E extends Base, ID extends Serializable> extends JpaRepository<E, ID> {
}
