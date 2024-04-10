package oop2.refactoring.ifs;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
public class Concurso {
	private List<Participante> participantes;
	private LocalDate fechaAperturaInscripcion;
	private LocalDate fechaCierreInscripcion;

	public Concurso(LocalDate fechaAperturaInscripcion, LocalDate fechaCierreInscripcion){
		this.fechaAperturaInscripcion = fechaAperturaInscripcion;
		this.fechaCierreInscripcion = fechaCierreInscripcion;
		participantes = new ArrayList<>();
	}

	public void agregarParticipante(Participante participante) throws RuntimeException {
		if (!esFechaValida()) {
			throw new RuntimeException("La fecha no es valida");
		}
		else if (esPrimerDia()) {
			participante.sumarPuntosPorInscripcion();
		}
		this.participantes.add(participante);
	}

	private boolean esPrimerDia() {//se inscribe el primer día de abierta la inscripcion?
		LocalDate fechaActual = LocalDate.now();
		LocalDate DiaDespuesDeLaAperturaInscripcion = fechaAperturaInscripcion.plusDays(1);
		if((fechaActual.isBefore(DiaDespuesDeLaAperturaInscripcion) || fechaActual.equals(DiaDespuesDeLaAperturaInscripcion))
				&& (fechaActual.isAfter(fechaAperturaInscripcion) || fechaActual.equals(fechaAperturaInscripcion))){
			return true;
		}
		return false;
	}
	private boolean esFechaValida() { //si se inscribe dentro del rango de inscripcion, true, sino false
		LocalDate fechaActual = LocalDate.now();
		if((fechaActual.equals(fechaAperturaInscripcion) || fechaActual.isAfter(fechaAperturaInscripcion)) &&
				(fechaActual.equals(fechaCierreInscripcion) || fechaActual.isBefore(fechaCierreInscripcion))){
			return true;
		}
		return false;
	}
	public int obtenerCantidadInscriptos(){
		return participantes.size();
	}
}
class Participante {
	public void sumarPuntosPorInscripcion() {
	}
}