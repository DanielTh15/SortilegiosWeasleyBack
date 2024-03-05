package com.example.Sortilegios.Weasley.Persistence.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class CompraArticuloPK implements Serializable {
    @Column(name = "id_factura")
    private Integer idFactura;
    @Column(name = "id_articulo")
    private Integer id;

    public Integer getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(Integer idFactura) {
        this.idFactura = idFactura;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
