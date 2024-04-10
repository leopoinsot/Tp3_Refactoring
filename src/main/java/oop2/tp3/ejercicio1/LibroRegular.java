package oop2.tp3.ejercicio1;

public class LibroRegular extends Libro{
	public LibroRegular(String nombre, int priceCode) {
		super(nombre, priceCode);
	}
	public double calularAlquiler(int cantidadDeDiasAlquilado) {
		float monto = 2;
		if (cantidadDeDiasAlquilado > 2)
			monto += (cantidadDeDiasAlquilado - 2) * 1.5;
		return monto;
	}
}
