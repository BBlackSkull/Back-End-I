public class Computadora {
    private String nombre;
    private int ram;
    private int ssd;
    private int id;
    private int contador;

    public Computadora(String nombre, int ram, int ssd) {
        this.nombre = nombre;
        this.ram = ram;
        this.ssd = ssd;
        this.contador = contador;
    }

    @Override
    public String toString() {
        return "Computadora{" +
                "nombre='" + nombre + '\n' +
                ", ram=" + ram +
                ", ssd=" + ssd +
                ", id=" + id +
                ", contador=" + contador +
                '}';
    }
    public void incremento(){
        contador++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getSsd() {
        return ssd;
    }

    public void setSsd(int ssd) {
        this.ssd = ssd;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }
}
