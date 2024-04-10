package oop2.refactoring.ifs;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class ConcursoTest {

	@Test
	void agregarParticipanteTest() {
		var participante = new Participante();
		var concurso = new Concurso(LocalDate.now().minusDays(2), LocalDate.now().plusDays(3));
		concurso.agregarParticipante(participante);
		assertEquals(1, concurso.obtenerCantidadInscriptos());
	}
}