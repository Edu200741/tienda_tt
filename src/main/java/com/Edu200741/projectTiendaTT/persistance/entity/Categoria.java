package com.Edu200741.projectTiendaTT.persistance.entity;

import jakarta.persistence.*;

import java.util.List;
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

    public Categoria(Integer idCategoria, List<Producto> productos, String descripcion, Boolean estado) {
        this.idCategoria = idCategoria;
        this.productos = productos;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    public Categoria() {
    }

    public Integer getIdCategoria() {

        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {

        this.idCategoria = idCategoria;
    }

    public List<Producto> getProductos() {

        return productos;
    }

    public void setProductos(List<Producto> productos) {

        this.productos = productos;
    }

    public String getDescripcion() {

        return descripcion;
    }

    public void setDescripcion(String descripcion) {

        this.descripcion = descripcion;
    }

    public Boolean getEstado() {

        return estado;
    }

    public void setEstado(Boolean estado) {

        this.estado = estado;
    }

}
