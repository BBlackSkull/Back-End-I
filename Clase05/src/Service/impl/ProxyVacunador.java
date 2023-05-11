package Service.impl;

import Service.IVacunador;
import com.sun.jdi.IntegerValue;
import model.Persona;

import java.time.LocalDate;
import java.util.*;

public class ProxyVacunador implements IVacunador {
    private Vacunador vacunador;
    private boolean controlaFecha(LocalDate turno){
        if (turno.isBefore(LocalDate.now())){
            return true;
        }else{
            return false;
        }
    }
    @Override
    public void vacunar(Persona persona) {
        if(controlaFecha(persona.getTurno())){
            vacunador.vacunar(persona);
        }else{
            System.out.println(persona);
            System.out.println("vuelve otro dia");
        }
    }

    public Vacunador getVacunador() {
        return vacunador;
    }

    public void setVacunador(Vacunador vacunador) {
        this.vacunador = vacunador;
    }
}
