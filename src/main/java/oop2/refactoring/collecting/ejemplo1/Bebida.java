package oop2.refactoring.collecting.ejemplo1;

public class Bebida extends ItemMenu {
    private float litros;
    public Bebida(String descripcion, float precio, float litros) {
        super(precio, descripcion);
        this.litros = litros;
    }
    @Override
    public float precioBebida() {
        return this.precio();
    }
}
