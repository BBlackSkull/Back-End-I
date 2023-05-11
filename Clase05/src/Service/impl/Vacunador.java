package Service.impl;

import Service.IVacunador;
import model.Persona;

public class Vacunador implements IVacunador {
    public void vacunar(Persona persona) {
        System.out.println(persona);
    }
}
