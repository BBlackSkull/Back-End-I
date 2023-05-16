import model.Contratado;
import model.Efectivo;
import model.Empleado;
import service.impl.LiquidadorContratado;
import service.impl.LiquidadorEfectivo;
public class Main {
    public static void main(String[] args) {
        Empleado empleado1 = new Efectivo("Jorge", "Ramiore", "225533AA", 200, 200.20,
                50, 20);
        Empleado empleado2 = new Contratado("Maria", "gonzale", "33444AA", 200,
                10, 20.00);
        LiquidadorContratado liquidadorContratado = new LiquidadorContratado();
        liquidadorContratado.liquidarEmpleado(empleado2);
        LiquidadorEfectivo liquidadorEfectivo = new LiquidadorEfectivo();
        liquidadorEfectivo.liquidarEmpleado(empleado1);

        // System.out.println(empleado1);

    }
}