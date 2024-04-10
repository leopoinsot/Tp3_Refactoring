package oop2.tp3.ejercicio1;

public class Libro {
    protected String nombre;
    protected int codigoPrecio;

    public Libro(String nombre, int priceCode) {
        this.nombre = nombre;
        this.codigoPrecio = priceCode;
    }

    public double calularAlquiler(int cantidadDeDiasAlquilado){
        return 0;
    }
    public boolean tieneBonusPorDiasDeAlquiler(int cantidadDeDiasAlquilado, int cantidadDiasParaObtenerBonus){
        return false;
    }
}