package oop2.tp3.ejercicio3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReporteDeGastosTest {

	@Test
	void imprimirTest() {
		var desayuno = new GastoDesayuno(2000);
		var cena = new GastoCena(6000);
		var alquilerDeAutos = new GastoAlquilerAuto(11000);
		var reporte = new ReporteDeGastos();

		String resultado = reporte.imprimir(desayuno, cena, alquilerDeAutos);

		// Verificar que el resultado contiene ciertas cadenas esperadas
		assertTrue(resultado.contains("Expreses"));
		assertTrue(resultado.contains(desayuno.obtenerNombre()));
		assertTrue(resultado.contains(cena.obtenerNombre()));
		assertTrue(resultado.contains(alquilerDeAutos.obtenerNombre()));
		assertTrue(resultado.contains("Gastos de comida:")); // Verificar la línea que indica los gastos de comida
		assertTrue(resultado.contains("Total de gastos:")); // Verificar la línea que indica el total de gastos

		// Verificar que el resultado contiene los montos correctos
		assertTrue(resultado.contains(String.valueOf(desayuno.obtenerGasto())));
		assertTrue(resultado.contains(String.valueOf(cena.obtenerGasto())));
		assertTrue(resultado.contains(String.valueOf(alquilerDeAutos.obtenerGasto())));
	}
}