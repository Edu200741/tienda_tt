package com.Edu200741.projectTiendaTT.persistance.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "categorias")
public class Categoria {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_categoria")
    private Integer idCategoria;

    @OneToMany(mappedBy = "categoria")
    private List<Producto> productos;

    private String descripcion;

    private Boolean estado;


}
