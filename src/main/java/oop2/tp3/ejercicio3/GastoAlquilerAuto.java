package oop2.tp3.ejercicio3;

public class GastoAlquilerAuto extends Gasto  {
	public GastoAlquilerAuto(int monto) {
		super(monto);
	}
	@Override
	public String obtenerNombre() {
		return "Alquiler de autos";
	}

	@Override
	public int obtenerGasto() {
		return this.monto;
	}
}
