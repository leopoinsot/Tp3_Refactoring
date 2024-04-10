package oop2.tp3.ejercicio3;

public class GastoCena extends Gasto{
	public GastoCena(int monto) {
		super(monto);
	}
	@Override
	public int obtenerGastoComida() {
		return this.monto;
	}

	@Override
	public int obtenerGasto() {
		return this.monto;
	}

	@Override
	public String obtenerNombre() {
		return "Cena";
	}

	@Override
	public String excesoDeComida() {
		return monto > 5000 ? "X" : " ";
	}
}
