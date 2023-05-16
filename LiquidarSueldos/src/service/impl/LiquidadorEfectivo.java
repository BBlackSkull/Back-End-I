package service.impl;

import model.Efectivo;
import model.Empleado;
import service.Liquidador;

public class LiquidadorEfectivo extends Liquidador {

    @Override
    public void calcularSueldo(Empleado empleado) {
        if (empleado instanceof Efectivo) {
            Efectivo empleadoEfectivo = (Efectivo) empleado;
            double sueldoFinal = empleadoEfectivo.getSueldoBasico() + empleadoEfectivo.getPremios()
                    - empleadoEfectivo.getDescuentos();
            empleadoEfectivo.setSueldo(sueldoFinal);

        }
    }


}
