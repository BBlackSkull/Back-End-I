public class Fibonacci {
    public static void main(String[] args) {


    int num1=0,num2= 1,suma =1,i;

    int limitadorVueltas = 10;

    for ( i =1; i < limitadorVueltas; i++){
        suma = num1 + num2;
        num1 = num2;
        num2 = suma;
        System.out.println(fibonacci(i));
    }

    }
    public static int fibonacci(int num){
        if (num ==0){
            return 0 ;
        }else if ( num ==1){
            return 1;

        }else {
            return fibonacci(num -1 ) + fibonacci(num - 2);
        }
    }

}

