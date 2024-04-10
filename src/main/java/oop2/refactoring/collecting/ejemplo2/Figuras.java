package oop2.refactoring.collecting.ejemplo2;

import java.util.ArrayList;
import java.util.List;

public class Figuras {
    private List<Figura> figuras;

    public Figuras(Figura... figuras) {
        this.figuras = List.of(figuras);
    }
    public Figuras(List<Figura> figuras) {
        this.figuras = figuras;
    }
    public void dibujarLosCirculos() {
        List<Figura> circulos = obtenercirculos();
        for (Figura circulo : circulos) {
            circulo.dibujar();
        }
    }
    public List<Figura> obtenercirculos() {
        var temp = new ArrayList<Figura>();
         for (Figura figura : this.figuras) {
               figura.soloCirculos(temp);
         }
        return temp;
    }
    public boolean figurasSonCirculos(){
        for(Figura figura : figuras){
			if(!(figura.esCirculo())){
                return false;
            }
        }
        return true;
    }
}