package oop2.tp3.ejercicio3;

import java.time.LocalDate;
import java.util.List;

public class ReporteDeGastos {
    public String imprimir(Gasto...gastos) {
        int total = 0;
        int gastosDeComida = 0;
        LocalDate localDate = LocalDate.now();

        String reporte = "";
        reporte = reporte.concat("Expreses "+ localDate.toString());

        for (Gasto gasto : gastos) {
            gastosDeComida += gasto.obtenerGastoComida();

            reporte = reporte.concat("\n" + gasto.obtenerNombre()
                            + "\t" + gasto.obtenerGasto()
                            + "\t" + gasto.excesoDeComida());

            total += gasto.obtenerGasto();
        }
        reporte = reporte.concat("\nGastos de comida: " + gastosDeComida);
        reporte = reporte.concat("\nTotal de gastos: " + total);
        return reporte;
    }
}
