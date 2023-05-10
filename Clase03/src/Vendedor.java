public abstract class Vendedor {
    protected int ventas;
    protected int puntos;
    protected String categoria;
    protected String nombre;

    public void mostrarCategoria() {
        calcularPuntos();
        recategorizar();
        System.out.println(this.nombre);
        System.out.println(this.puntos);
        System.out.println(this.categoria);

    }

    public void recategorizar() {
        if (this.puntos<20){
            this.categoria = "novato";
        }else
            if (this.puntos<=30){
                this.categoria = "aprendiz";
            } else
                if(this.puntos <= 40){
                    this.categoria = "buenos";

                } else {
                    this.categoria = "maestro";
                }


           }




    public void vender() {
        this.ventas++;
    }

    public abstract void calcularPuntos();
}
