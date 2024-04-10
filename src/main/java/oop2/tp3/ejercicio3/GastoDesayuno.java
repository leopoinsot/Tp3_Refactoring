package oop2.tp3.ejercicio3;

public class GastoDesayuno extends Gasto{

	public GastoDesayuno(int monto) {
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
		return "Desayuno";
	}

	@Override
	public String excesoDeComida() {
		return monto > 1000 ? "X" : " ";
	}
}
