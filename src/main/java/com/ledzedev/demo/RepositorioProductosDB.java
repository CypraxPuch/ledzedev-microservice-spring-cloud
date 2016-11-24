package com.ledzedev.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.Collection;

/**
 * Código generado por Gerado Pucheta Figueroa
 * Twitter: @ledzedev
 * http://ledze.mx
 * 16/Nov/2016.
 */
@RepositoryRestResource
public interface RepositorioProductosDB extends JpaRepository<Producto, Long> {

    @RestResource(path = "by-np")
    Collection<Producto> findByNombreProducto(@Param("np") String nombreProd);

}
