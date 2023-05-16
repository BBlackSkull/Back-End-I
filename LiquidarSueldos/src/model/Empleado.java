package model;

public abstract class Empleado {

    private String nombre;
    private String apellido;
    private String cuenta;
    private double sueldo;

    public Empleado(String nombre, String apellido, String cuenta, double sueldo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cuenta = cuenta;
        this.sueldo = sueldo;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

}
