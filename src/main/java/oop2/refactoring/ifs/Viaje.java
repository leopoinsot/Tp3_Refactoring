package oop2.refactoring.ifs;

import java.time.LocalDate;
import java.time.LocalTime;

public class Viaje {
    public static final int VIAJE_NOCTURNO_INICIO = 22;

    public static final int VIAJE_NOCTURNO_FIN = 06;
    private static final int COEFICIENTE_VIAJE_NOCTURNO = 5;
    private static final int COEFICIENTE_VIAJE_DIURNO = 3;
    private static final int COEFICIENTE_VIAJE_DOMINGO = 4;
    private LocalDate fechaSalida;
    private LocalTime horaSalida;
    private double distanciaRecorrida;

    public double costoDelViaje() {
		if (esHorarioNocturno()) {return distanciaRecorrida * COEFICIENTE_VIAJE_NOCTURNO;}

		else if (esDomingo()) {return distanciaRecorrida * COEFICIENTE_VIAJE_DOMINGO;}

		else {return distanciaRecorrida * COEFICIENTE_VIAJE_DIURNO;}
	}

    private boolean esDomingo() {
        return true;
    }

    private boolean esHorarioNocturno() {
        return horaSalida.getHour() > VIAJE_NOCTURNO_INICIO || horaSalida.getHour() < VIAJE_NOCTURNO_FIN;
    }
}
