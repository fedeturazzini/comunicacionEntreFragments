package com.example.fedet.entregablematerialdesign.Model;

/**
 * Created by fedet on 5/6/2017.
 */

public class Recetas {
    private String recetas;
    private Integer imagenRecetas;
    private String descripcion;

    public Recetas(String recetas, Integer imagenRecetas, String descripcion) {
        this.recetas = recetas;
        this.imagenRecetas = imagenRecetas;
        this.descripcion = descripcion;
    }

    public Integer getImagenRecetas() {
        return imagenRecetas;
    }

    public String getRecetas() {
        return recetas;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
