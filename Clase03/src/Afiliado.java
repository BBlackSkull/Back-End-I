public class Afiliado extends Vendedor{
    @Override
    public void calcularPuntos() {
    this.puntos = this.ventas * 15;
    }
}
