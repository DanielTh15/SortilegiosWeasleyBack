package com.example.Sortilegios.Weasley.Persistence.Entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "mago")
public class Mago {
    @Id
    @Column(name = "id_mago")
    private String id;
    private String nombre;
    private String apellido;
    private String celular;
    private String correo;
    @OneToMany(mappedBy = "mago")
    private List<Compra> compraList;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public List<Compra> getCompraList() {
        return compraList;
    }

    public void setCompraList(List<Compra> compraList) {
        this.compraList = compraList;
    }
}
