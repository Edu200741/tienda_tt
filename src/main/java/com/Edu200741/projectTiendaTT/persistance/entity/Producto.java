package com.Edu200741.projectTiendaTT.persistance.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "productos")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private Integer idProducto;

    @ManyToOne
    @JoinColumn(name = "id_categoria", insertable = false, updatable = false)
    private Categoria categoria;


    private String nombre;

    @Column(name = "id_categoria")
    private Integer idCategoria;

    @Column(name = "codigo_barras")
    private String codigoBarras;

    @Column(name = "precio_venta")
    private Integer precioVenta;

    @Column(name = "cantidad_stock")
    private Integer cantidadStock;

    private Boolean estado;


    @OneToMany(mappedBy = "producto")
    private List<CompraProducto> productos;

    public Producto() {
    }

    public Producto(Integer idProducto, Categoria categoria, String nombre, Integer idCategoria, String codigoBarras, Integer precioVenta, Integer cantidadStock, Boolean estado, List<CompraProducto> productos) {
        this.idProducto = idProducto;
        this.categoria = categoria;
        this.nombre = nombre;
        this.idCategoria = idCategoria;
        this.codigoBarras = codigoBarras;
        this.precioVenta = precioVenta;
        this.cantidadStock = cantidadStock;
        this.estado = estado;
        this.productos = productos;
    }

    public Integer getIdProducto() {

        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {

        this.idProducto = idProducto;
    }

    public Categoria getCategoria() {

        return categoria;
    }

    public void setCategoria(Categoria categoria) {

        this.categoria = categoria;
    }

    public String getNombre() {

        return nombre;
    }

    public void setNombre(String nombre) {

        this.nombre = nombre;
    }

    public Integer getIdCategoria() {

        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {

        this.idCategoria = idCategoria;
    }

    public String getCodigoBarras() {

        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {

        this.codigoBarras = codigoBarras;
    }

    public Integer getPrecioVenta() {

        return precioVenta;
    }

    public void setPrecioVenta(Integer precioVenta) {

        this.precioVenta = precioVenta;
    }

    public Integer getCantidadStock() {

        return cantidadStock;
    }

    public void setCantidadStock(Integer cantidadStock) {

        this.cantidadStock = cantidadStock;
    }

    public Boolean getEstado() {

        return estado;
    }

    public void setEstado(Boolean estado) {

        this.estado = estado;
    }

    public List<CompraProducto> getProductos() {

        return productos;
    }

    public void setProductos(List<CompraProducto> productos) {

        this.productos = productos;
    }
}