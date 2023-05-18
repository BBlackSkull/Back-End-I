public class Array2D {
    public static void main(String[] args) {


        int[][] Arr = {{25, 32, 45, 99},
                {752, 65, 15, 21},
                {68, 546, 39, 95},
                {98, 52, 354, 21}
        };

        int i, j, k;


        for (i = 0; i < Arr.length; i++) {

            for (j = 0; j < Arr[i].length - 1; j++) {

                for (k = 0; k < Arr[i].length - j - 1; k++) {

                    if (Arr[i][k] > Arr[i][k + 1]) {

                        int aux = Arr[i][k];

                        Arr[i][k] = Arr[i][k + 1];

                        Arr[i][k + 1] = aux;

                    }
                }
            }
        }
        for (i = 0; i < Arr.length; i++) {
            for (j = 0; j < Arr[i].length; j++) {
                System.out.print(Arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
