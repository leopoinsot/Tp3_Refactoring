package oop2.tp3.ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private List<Alquiler> alquileres = new ArrayList<Alquiler>();
    private String name;
    public Cliente(String nombre) {
        this.name = nombre;
    }

    public Object[] calcularDeudaYPuntosObtenidos() {
        Object[] resultado = new Object[2];
        double total = 0;
        int puntosAlquilerFrecuente = 0;
        for (Alquiler alquiler : alquileres) {
            total += alquiler.calcularAlquiler();

            puntosAlquilerFrecuente++; // sumo puntos por alquiler

            if (alquiler.tieneBonusPorDiasAlquiler(1)) { // bonus por dos días de alquiler de un nuevo lanzamiento
                puntosAlquilerFrecuente++;
            }
        }
        resultado[0] = total;
        resultado[1] = puntosAlquilerFrecuente;
        return resultado;
	}

    public void alquilar(Alquiler rental) {
        alquileres.add(rental);
    }
}