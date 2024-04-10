package oop2.tp3.ejercicio1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

	@Test
	void calcularDeudaYPuntosObtenidosLibroRegularTest() {
		var elTunel = new LibroRegular("El Túnel", 1);
		var antesDelFin = new LibroRegular("Antes del Fin", 2);

		var elTunelCopia = new CopiaLibro(elTunel);
		var antesDelFinCopia = new CopiaLibro(antesDelFin);

		var alquilerElTunel = new Alquiler(elTunelCopia, 5);
		var alquilerAntesDelFin = new Alquiler(antesDelFinCopia, 3);

		var yo = new Cliente("Leonel");
		yo.alquilar(alquilerElTunel);
		yo.alquilar(alquilerAntesDelFin);

		Object[] resultado = yo.calcularDeudaYPuntosObtenidos();
		assertEquals(10.0, resultado[0]);
	}
	@Test
	void calcularDeudaYPuntosObtenidosLibroInfantilTest() {
		var elTunel = new LibroInfantil("El Túnel", 1);
		var antesDelFin = new LibroInfantil("Antes del Fin", 2);

		var elTunelCopia = new CopiaLibro(elTunel);
		var antesDelFinCopia = new CopiaLibro(antesDelFin);

		var alquilerElTunel = new Alquiler(elTunelCopia, 5);
		var alquilerAntesDelFin = new Alquiler(antesDelFinCopia, 3);

		var yo = new Cliente("Leonel");
		yo.alquilar(alquilerElTunel);
		yo.alquilar(alquilerAntesDelFin);

		Object[] resultado = yo.calcularDeudaYPuntosObtenidos();
		assertEquals(6.0, resultado[0]);
	}

	@Test
	void calcularDeudaYPuntosObtenidosLibroNuevoLanzamientoTest() {
		var elTunel = new LibroNuevoLanzamiento("El Túnel", 1);
		var antesDelFin = new LibroNuevoLanzamiento("Antes del Fin", 2);

		var elTunelCopia = new CopiaLibro(elTunel);
		var antesDelFinCopia = new CopiaLibro(antesDelFin);

		var alquilerElTunel = new Alquiler(elTunelCopia, 5);
		var alquilerAntesDelFin = new Alquiler(antesDelFinCopia, 3);

		var yo = new Cliente("Leonel");
		yo.alquilar(alquilerElTunel);
		yo.alquilar(alquilerAntesDelFin);

		Object[] resultado = yo.calcularDeudaYPuntosObtenidos();
		assertEquals(6.0, resultado[0]);
	}


}