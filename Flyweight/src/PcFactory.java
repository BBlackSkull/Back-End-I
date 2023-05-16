import java.util.HashMap;

public class PcFactory {
    private  HashMap<String, Computadora> computadoraMap = new HashMap<String, Computadora>();
    public  Computadora getComputadora(String tipoComputadora, int ram, int ssd) {
        if(!computadoraMap.containsKey(tipoComputadora)){

            Computadora pc = new Computadora(tipoComputadora,ram,ssd);
            computadoraMap.put(tipoComputadora, pc);
            System.out.println("Creando objeto computadora");
        }
        Computadora pc = computadoraMap.get(tipoComputadora);
        pc.incremento();
        return pc;
    }
    public void muestra(){
        System.out.println(computadoraMap.get("Windows"));
        System.out.println(computadoraMap.get("Mac"));
    }
}
