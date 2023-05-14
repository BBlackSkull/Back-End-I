package service.impl;

import model.Contratado;
import model.Empleado;
import service.Liquidador;

public class LiquidadorContratado extends Liquidador {
    @Override
    public void calcularSueldo(Empleado empleado) {
        Contratado contratado = (Contratado) empleado;
        double sueldoFinal = contratado.getCantidadHoras() * contratado.getTarifa();
        contratado.setSueldo(sueldoFinal);
    }
}
