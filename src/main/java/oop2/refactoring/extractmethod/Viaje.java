package oop2.refactoring.extractmethod;

import java.time.LocalDate;
import java.time.LocalTime;

public class Viaje {
    public static final int INICIO_HORARIO_NOCTURNO = 22;
    public static final int CIERRE_HORARIO_DIURNO = 06;
    private static final int TARIFA_NOCTURNA = 5;
    private static final int TARIFA_DIURNA = 3;
    private LocalDate fechaSalida;
    private LocalTime horaSalida;
    private double distanciaRecorrida;
    public double costoDelViaje() {
        if (horarioNocturno()) {return distanciaRecorrida * TARIFA_NOCTURNA;}

        else {return distanciaRecorrida *  TARIFA_DIURNA;}
    }
    private boolean horarioNocturno(){
        return (horaSalida.getHour() > INICIO_HORARIO_NOCTURNO || horaSalida.getHour() < CIERRE_HORARIO_DIURNO);
    }
}
