package oop2.tp3.ejercicio4;

import org.jdbi.v3.core.Jdbi;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonaRepositoryTest {

	@Test
	void buscarPorNombre() {
		Jdbi jdbi = Jdbi.create("jdbc:hsqldb:mem;create=true");
		new SetUpDatabase(jdbi).setUp();
		var repo = new PersonaRepository(jdbi);
		assertEquals(1,repo.buscarPorNombre("Vla").size());
	}

	@Test
	void buscarId() {
		Jdbi jdbi = Jdbi.create("jdbc:hsqldb:mem;create=true");
		new SetUpDatabase(jdbi).setUp();
		var repo = new PersonaRepository(jdbi);
		repo.buscarId(1L).ifPresent(persona -> assertEquals("José", persona.nombre()));
	}
}