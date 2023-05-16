public class ControlPeso extends ControlCalidad{
    @Override
    void controlCalidad(Articulo articulo) {
        if ( articulo.getPeso()>1200 && articulo.getPeso()<1300){
            getSiguienteControl().controlCalidad(articulo);
            System.out.println("Control de peso aprobado, pasando a la siguiente etapa");
        }else{
            System.out.println("el articulo no paso el control de peso");
        }
    }
}
