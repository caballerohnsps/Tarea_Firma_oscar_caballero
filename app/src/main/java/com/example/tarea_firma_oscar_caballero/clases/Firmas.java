package com.example.tarea_firma_oscar_caballero.clases;

public class Firmas {

    private Integer id;
    private byte[] image;
    private String descripcion;

    public Firmas(){}
    public Firmas(Integer id, byte[] image, String descripcion) {
        this.id = id;
        this.image = image;
        this.descripcion = descripcion;
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public byte[] getImage() {
        return image;
    }
    public void setImage(byte[] image) {
        this.image = image;
    }

    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
