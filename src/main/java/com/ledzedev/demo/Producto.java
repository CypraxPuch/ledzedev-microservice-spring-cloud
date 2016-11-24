package com.ledzedev.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Código generado por Gerado Pucheta Figueroa
 * Twitter: @ledzedev
 * http://ledze.mx
 * 24/Nov/2016.
 */
@Entity
public class Producto {

    @Id
    @GeneratedValue
    private Long id;

    private String nombreProducto;

    private Long cantidadExistente;

    public Producto(String nombreProducto, Long cantidadExistente) {
        this.nombreProducto = nombreProducto;
        this.cantidadExistente = cantidadExistente;
    }

    public Producto() {//nadie sabe por qué, pero es requisito de JPA
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public Long getCantidadExistente() {
        return cantidadExistente;
    }

    public void setCantidadExistente(Long cantidadExistente) {
        this.cantidadExistente = cantidadExistente;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "id=" + id +
                ", nombreProducto='" + nombreProducto + '\'' +
                ", cantidadExistente=" + cantidadExistente +
                '}';
    }
}
