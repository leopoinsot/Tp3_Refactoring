package oop2.tp3.ejercicio1;

public class LibroNuevoLanzamiento extends Libro{
	public LibroNuevoLanzamiento(String nombre, int priceCode) {
		super(nombre, priceCode);
	}
	public double calularAlquiler(int cantidadDeDiasAlquilado) {
		return cantidadDeDiasAlquilado * 3;
	}
	public boolean tieneBonusPorDiasDeAlquiler(int cantidadDeDiasAlquilado, int cantidadDiasParaObtenerBonus){
		return cantidadDeDiasAlquilado > cantidadDiasParaObtenerBonus;

	}
}
