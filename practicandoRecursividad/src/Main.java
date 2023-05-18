public class Main {
    public static void main(String[] args) {

        int [] Arr= {23,54,56,256,841,235,85};

            int i,j;

        for (  i=0; i < Arr.length; i++) {
            System.out.println(Arr[i]);
            for (  j=0; j < Arr.length - i -1; j++){

                if(Arr[j]> Arr[j+1]){
                    int aux = Arr[j];
                    Arr[j] = Arr[j+1];
                     Arr[j+1] = aux;
                }

            }
        }
    }


}