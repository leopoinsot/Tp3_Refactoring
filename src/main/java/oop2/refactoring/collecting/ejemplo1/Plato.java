package oop2.refactoring.collecting.ejemplo1;

enum TIPO {
    ENTRADA, PRINCIPAL
}
public class Plato extends ItemMenu {
    private TIPO tipoDePlato;
    public Plato(String descripcion, float precio, TIPO tipodePlato) {
        super(precio, descripcion);
        this.tipoDePlato = tipodePlato;
    }
    @Override
    public float precioPlato() {
        return this.precio();
    }
}