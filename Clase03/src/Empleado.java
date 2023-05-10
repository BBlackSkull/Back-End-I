public class Empleado extends Vendedor{

    private int antiguedad;
    private int afiliados;

    @Override
    public void calcularPuntos() {

        this.puntos = antiguedad * 5 + this.afiliados *10 + this.ventas * 5;

    }
}
