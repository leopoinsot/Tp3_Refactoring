package oop2.refactoring.collecting.ejemplo2;

import java.util.ArrayList;

public class Rectangulo extends Figura {
    @Override
    public void soloCirculos(ArrayList<Figura> temp) {}
    @Override
    public boolean esCirculo() {
        return false;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando el Rectangulo...");
    }

}
