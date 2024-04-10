package oop2.tp3.ejercicio3;

import java.util.List;

public class EjemploDeUsoDelReporte {
    public static void main(String[] args) {
        var desayuno = new GastoDesayuno(2000);
        var cena = new GastoCena(6000);
        var alquilerDeAutos = new GastoAlquilerAuto(11000);
        var reporte = new ReporteDeGastos();
        System.out.print(reporte.imprimir(desayuno, cena, alquilerDeAutos));
    }
}
