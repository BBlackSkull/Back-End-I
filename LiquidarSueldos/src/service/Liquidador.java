package service;

import model.Contratado;
import model.Efectivo;
import model.Empleado;

public abstract class Liquidador {


    public void liquidarEmpleado(Empleado empleado){
        calcularSueldo(empleado);
        imprimirRecibo(empleado);
        deposito(empleado);

    }
    public abstract void calcularSueldo(Empleado empleado);
    private void imprimirRecibo(Empleado empleado){
        if(empleado instanceof Efectivo){
            System.out.println("Imprimiendo recibo");
        }else
            if (empleado instanceof Contratado){
                System.out.println("Enviando recibo por Email");

        } else{
                System.out.println("Lo siento empelado no encontrado");
            }
    }
    private void deposito (Empleado empleado){
        System.out.println("Depositando en la cuenta de " + empleado.getNombre() + "numero de cuenta" +
                empleado.getCuenta());
}
}
