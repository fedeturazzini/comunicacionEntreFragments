package com.example.fedet.entregablematerialdesign.Model;

/**
 * Created by fedet on 2/6/2017.
 */

public class Restaurante {

    private Integer imagenResource;
    private String nombre;

    public Restaurante(Integer imagenResource, String unNombre) {
        this.imagenResource = imagenResource;
        this.nombre = unNombre;
    }

    public Integer getImagenResource() {
        return imagenResource;
    }

    public String getNombre() {
        return nombre;
    }


}
