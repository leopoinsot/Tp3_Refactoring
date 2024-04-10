package oop2.tp3.ejercicio1;

public class CopiaLibro {
    private Libro libro;

    public CopiaLibro(Libro libro) {
        this.libro = libro;
    }

   public double calcularAlquiler(int cantidadDeDiasAlquilado){
        return libro.calularAlquiler(cantidadDeDiasAlquilado);
   }
    public boolean tieneBonusPorDiasAlquiler(int cantidadDeDiasAlquilado, int cantidadDiasParaObtenerBonus){
        return libro.tieneBonusPorDiasDeAlquiler(cantidadDeDiasAlquilado, cantidadDiasParaObtenerBonus);
    }

}