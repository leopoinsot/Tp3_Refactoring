package oop2.refactoring.collecting.ejemplo2;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FigurasTest {
	@Test
	void dibujarSolocirculosTest() {
		Figura circulo = new Circulo();
		Figura hexa = new Hexagono();
		Figura rec = new Rectangulo();
		Figura circulo2 = new Circulo();

		Figuras fs = new Figuras(circulo, hexa, rec, circulo2);
		Figuras soloCirculos = new Figuras(fs.obtenercirculos());
		assertTrue(soloCirculos.figurasSonCirculos());
	}
}