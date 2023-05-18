import java.util.*;
public class DadosRandom {
    public static void main(String[] args) {



        System.out.println(girando1(dado1));

    }

    static Random rand = new Random();
    static int dado1 = rand.nextInt(6) + 1;
    
    static int acc =0;

    public static int girando1(int dado1){
        int dado = 1;
        while(dado != dado1) {
              dado = rand.nextInt(6)+1;
            acc++;
            System.out.println("vuelta numero " + acc);
        }

        return acc;


    }


}