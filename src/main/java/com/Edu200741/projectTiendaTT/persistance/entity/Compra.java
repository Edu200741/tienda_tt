package com.Edu200741.projectTiendaTT.persistance.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "compras")
public class Compra {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_compra")
    private Integer idCompra;

    @Column(name = "id_cliente")
    private Integer idCliente;

    private LocalDateTime fecha;

    private String medioPago;

    private String comentario;

    private String estado;

    @OneToMany(mappedBy = "compra")
    private List<CompraProducto> productos;

    public Compra(Integer idCompra, Integer idCliente, LocalDateTime fecha, String medioPago, String comentario, String estado, List<CompraProducto> productos) {
        this.idCompra = idCompra;
        this.idCliente = idCliente;
        this.fecha = fecha;
        this.medioPago = medioPago;
        this.comentario = comentario;
        this.estado = estado;
        this.productos = productos;
    }

    public Compra() {
    }

    public Integer getIdCompra() {

        return idCompra;
    }

    public void setIdCompra(Integer idCompra) {

        this.idCompra = idCompra;
    }

    public Integer getIdCliente() {

        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {

        this.idCliente = idCliente;
    }

    public LocalDateTime getFecha() {

        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {

        this.fecha = fecha;
    }

    public String getMedioPago() {

        return medioPago;
    }

    public void setMedioPago(String medioPago) {

        this.medioPago = medioPago;
    }

    public String getComentario() {

        return comentario;
    }

    public void setComentario(String comentario) {

        this.comentario = comentario;
    }

    public String getEstado() {

        return estado;
    }

    public void setEstado(String estado) {

        this.estado = estado;
    }

    public List<CompraProducto> getProductos() {

        return productos;
    }

    public void setProductos(List<CompraProducto> productos) {

        this.productos = productos;
    }
}