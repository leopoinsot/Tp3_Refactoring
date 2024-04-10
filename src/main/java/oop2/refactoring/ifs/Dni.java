package oop2.refactoring.ifs;

public class Dni {
    private String numeroDni;
    public Dni(String dni) {
        if (dni == null) {
            throw new RuntimeException("Dni no puede ser nulo");
        }
        else if (dni.isEmpty()) {
            throw new RuntimeException("Dni no puede ser vacío");
        }
        else if (!tieneLargoCorrecto(dni)) {
            throw new RuntimeException("El largo del dni no puede ser menor a 3 ni mayor a 10");
        }
        else if (!todosNumeros(dni)) {
            throw new RuntimeException("Debe ingresar números solamente");
        }
        else{this.numeroDni = dni;}
    }
    private boolean tieneLargoCorrecto(String dni) {
        return false;
    }
    private boolean todosNumeros(String dni) {
        return true;
    }
}
