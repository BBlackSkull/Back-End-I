package model;

import model.Empleado;

public class Contratado extends Empleado {
    private int cantidadHoras;
    private double tarifa;

    public Contratado(String nombre, String apellido, String cuenta, int sueldo, int cantidadHoras, double tarifa) {
        super(nombre, apellido, cuenta, sueldo);
        this.cantidadHoras = cantidadHoras;
        this.tarifa = tarifa;
    }

    public int getCantidadHoras() {
        return cantidadHoras;
    }

    public void setCantidadHoras(int cantidadHoras) {
        this.cantidadHoras = cantidadHoras;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

}
