public class Main {
    public static void main(String[] args) {

        PcFactory factory = new PcFactory();
        Computadora pc1 = factory.getComputadora("windows",4,128);
        Computadora pc2 = factory.getComputadora("windows",4,128);
        Computadora pc3 = factory.getComputadora("windows",4,128);
        Computadora pc4 = factory.getComputadora("mac",16,512);

        factory.muestra();
    }
}