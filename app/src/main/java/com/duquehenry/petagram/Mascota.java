package com.duquehenry.petagram;

/**
 * Created by hduque on 24/07/2016.
 */
public class Mascota {

    //Atributos
    private String  nombreMascota;
    private String  raitingMascota;
    private int     fotoMascota;

    //Constructor
    public Mascota(String nombreMascota, String raitingMascota, int fotoMascota) {
        this.nombreMascota = nombreMascota;
        this.raitingMascota = raitingMascota;
        this.fotoMascota = fotoMascota;
    }

    //Getters y Setters
    public String getNombreMascota() {
        return nombreMascota;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    public String getRaitingMascota() {
        return raitingMascota;
    }

    public void setRaitingMascota(String raitingMascota) {
        this.raitingMascota = raitingMascota;
    }

    public int getFotoMascota() {
        return fotoMascota;
    }

    public void setFotoMascota(int fotoMascota) {
        this.fotoMascota = fotoMascota;
    }
}
