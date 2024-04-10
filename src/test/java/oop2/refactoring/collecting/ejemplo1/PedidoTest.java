package oop2.refactoring.collecting.ejemplo1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PedidoTest {

	@Test
	void totalBebidasTest() {
		var b1 = new Bebida("Fanta", 10, 0.75F);
		var b2 = new Bebida("Quilmes", 20, 0.75F);
		var b3 = new Bebida("Coca", 15, 0.75F);

		var p1 = new Plato("fideos", 300, TIPO.PRINCIPAL);
		var p2 = new Plato("Bife", 600, TIPO.PRINCIPAL);
		var p3 = new Plato("Pollo", 400, TIPO.PRINCIPAL);

		var pedido = new Pedido(b1, b2, b3, p1, p2, p3);

		assertEquals(45.0, pedido.totalBebidas());
	}

	@Test
	void totalPlatosTest() {
		var b1 = new Bebida("Fanta", 10, 0.75F);
		var b2 = new Bebida("Quilmes", 20, 0.75F);
		var b3 = new Bebida("Coca", 15, 0.75F);

		var p1 = new Plato("fideos", 300, TIPO.PRINCIPAL);
		var p2 = new Plato("Bife", 600, TIPO.PRINCIPAL);
		var p3 = new Plato("Pollo", 400, TIPO.PRINCIPAL);

		var pedido = new Pedido(b1, b2, b3, p1, p2, p3);

		assertEquals(1300.0, pedido.totalPlatos());
	}
}