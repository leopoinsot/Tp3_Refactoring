package oop2.refactoring.numerosmagicos;

import java.time.LocalDate;
import java.time.LocalTime;

public class Viaje {
    public static final int VIAJE_NOCTURNO_INICIO = 22;
    public static final int VIAJE_NOCTURNO_FIN = 06;
    public static final int COEFICIENTE_VIAJE_NOCTURNO = 5;
    public static final int COEFICIENTE_VIAJE_DIURNO = 3;

    private LocalDate fechaSalida;
    private LocalTime horaSalida;
    private double distanciaRecorrida;

    public double costoDelViaje() {
        if (horarioNocturno()) {
            return distanciaRecorrida * COEFICIENTE_VIAJE_NOCTURNO;
        }
        else{return distanciaRecorrida * COEFICIENTE_VIAJE_DIURNO;}
    }

    private boolean horarioNocturno() {
        return horaSalida.getHour() > VIAJE_NOCTURNO_INICIO || horaSalida.getHour() < VIAJE_NOCTURNO_FIN;
    }
}


