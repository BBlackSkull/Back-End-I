public class Test {
    public static void main(String[] args) {

        Articulo articulo= new Articulo("articulo",1010,1250,"sAno");
        AnalistaCalidad analistaCalidad= new AnalistaCalidad();
        analistaCalidad.validadCalidad(articulo);

    }
}