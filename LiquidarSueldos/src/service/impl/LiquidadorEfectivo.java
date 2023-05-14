package service.impl;

import model.Contratado;
import model.Efectivo;
import model.Empleado;
import service.Liquidador;

public class LiquidadorEfectivo extends Liquidador {

    @Override
    public void calcularSueldo(Empleado empleado) {
        Efectivo empleadoEfectivo = (Efectivo) empleado;
        double sueldoFinal = empleadoEfectivo.getSueldoBasico() + empleadoEfectivo.getPremios()
                - empleadoEfectivo.getDescuentos();
        empleadoEfectivo.setSueldo(sueldoFinal);
    }


}
