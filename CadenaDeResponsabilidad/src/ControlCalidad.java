public abstract class ControlCalidad {
    private ControlCalidad siguienteControl;
    abstract void  controlCalidad(Articulo articulo);

    public ControlCalidad getSiguienteControl() {
        return siguienteControl;
    }

    public void setSiguienteControl(ControlCalidad siguienteControl) {
        this.siguienteControl = siguienteControl;
    }
}
