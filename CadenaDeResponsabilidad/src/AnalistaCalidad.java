public class AnalistaCalidad {
    public void validadCalidad(Articulo articulo){
        ControlCalidad controlPeso = new ControlPeso();
        ControlCalidad controlLote = new ControlLote();
        ControlCalidad controlEnvase = new ControlEnvase();
        controlLote.setSiguienteControl(controlPeso);
        controlPeso.setSiguienteControl(controlEnvase);
        controlPeso.controlCalidad(articulo);

    }
}
