package oop2.tp3.ejercicio1;

public class LibroInfantil extends Libro {
	public LibroInfantil(String nombre, int priceCode) {
		super(nombre, priceCode);
	}

	public double calularAlquiler(int cantidadDeDiasAlquilado) {
		float monto = 1.5f;
		if (cantidadDeDiasAlquilado > 3) {
			monto += (cantidadDeDiasAlquilado - 3) * 1.5;
		}
		return monto;
	}
}
