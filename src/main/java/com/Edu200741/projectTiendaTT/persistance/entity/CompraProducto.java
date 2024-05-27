package com.Edu200741.projectTiendaTT.persistance.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name ="compras_productos")
public class CompraProducto {

    @EmbeddedId
    private CompraProductoPK id;

    private Integer cantidad;

    private Integer total;

    private Boolean estado;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "id_producto", insertable = false, updatable = false)
    private Producto producto;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "id_compra", insertable = false, updatable = false)
    private Compra compra;


}
