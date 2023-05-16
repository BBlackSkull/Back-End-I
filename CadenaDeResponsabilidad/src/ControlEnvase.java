public class ControlEnvase extends ControlCalidad{
    @Override
    void controlCalidad(Articulo articulo) {
        if( "sano".equalsIgnoreCase(articulo.getEnvase())){
            getSiguienteControl().controlCalidad(articulo);
            System.out.println("Control de Envase aprobado.");
        }else
            if("casi sano".equalsIgnoreCase(articulo.getEnvase())){
                getSiguienteControl().controlCalidad(articulo);
                System.out.println("Control de Envase aprobado.");
        }else{
                System.out.println("El articulo no paso el control de envase");
            }
    }
}
