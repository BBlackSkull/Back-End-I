package service.impl;

import model.Contratado;
import model.Efectivo;
import model.Empleado;
import service.Liquidador;

public class LiquidadorContratado extends Liquidador {
    @Override
    public void calcularSueldo(Empleado empleado) {
        if (empleado instanceof Contratado) {
            Contratado contratado = (Contratado) empleado;
            double sueldoFinal = contratado.getCantidadHoras() * contratado.getTarifa();
            contratado.setSueldo(sueldoFinal);

        }
    }
}
