import Service.impl.ProxyVacunador;
import Service.impl.Vacunador;
import model.Persona;

import java.time.LocalDate;

public class TestVacunaProxy {

    public static void main(String[] args) {

        Persona p = new Persona("Juan", "Pere", "123456", "Pfizer",
                LocalDate.of(2023, 05, 12));

        Vacunador vacunador = new Vacunador();

        ProxyVacunador proxy = new ProxyVacunador();

        proxy.setVacunador(vacunador);

        proxy.vacunar(p);

    }
}