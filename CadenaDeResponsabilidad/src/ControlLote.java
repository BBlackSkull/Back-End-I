public class ControlLote extends ControlCalidad{
    @Override
    void controlCalidad(Articulo articulo) {
        if ( articulo.getLote()>1000 && articulo.getLote()<1200){
            getSiguienteControl().controlCalidad(articulo);
            System.out.println("Control de Lote aprobado, pasando a la siguiente etapa");
        }else{
            System.out.println("el articulo no paso el control de Lote");
        }
    }
}
