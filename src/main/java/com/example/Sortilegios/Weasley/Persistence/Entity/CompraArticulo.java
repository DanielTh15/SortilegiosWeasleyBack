package com.example.Sortilegios.Weasley.Persistence.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "detalle_compra")
public class CompraArticulo {

    @EmbeddedId
    private CompraArticuloPK id;
    private Integer cantidad;
    private Float total;
    @MapsId("idFactura")
    @ManyToOne
    @JoinColumn(name = "id_factura", updatable = false, insertable = false)
    private Compra compra;
    @ManyToOne
    @JoinColumn(name = "id_articulo", updatable = false, insertable = false)
    private Articulo articulo;

    public CompraArticuloPK getId() {
        return id;
    }

    public void setId(CompraArticuloPK id) {
        this.id = id;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Float getTotal() {
        return total;
    }

    public void setTotal(Float total) {
        this.total = total;
    }

    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }

    public Articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }
}
