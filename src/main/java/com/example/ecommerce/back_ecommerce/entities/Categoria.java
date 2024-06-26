package com.example.ecommerce.back_ecommerce.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.HashSet;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@SuperBuilder
public class Categoria extends Base{
    private String denominacion;
    private boolean esInsumo;

    @JsonIgnore
    @ManyToMany(mappedBy = "categorias")
    @Builder.Default
    private Set<Sucursal> sucursales = new HashSet<>();

    //@OneToMany
    //@JoinColumn(name = "categoria_id")
    //@Builder.Default
    //private Set<Articulo> articulos = new HashSet<>();

//    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "categoriaPadre")
//    @JsonIgnoreProperties("categoriaPadre")
//    @Builder.Default
//    private Set<Categoria> subCategorias = new HashSet<>();
}
