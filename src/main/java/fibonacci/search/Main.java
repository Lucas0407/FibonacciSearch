package fibonacci.search;

public class Main {
    public static void main(String[] args) {
        int[] array = {2, 3, 4, 10, 40};
        int fibM = 5;
        int fibMm1 = 3;
        int fibMm2 = 2;
        int x = 3;
        int indice = -1;

        do {
            if (array[fibMm2] == x) {
                System.out.println("O elemento está no Indice: " + fibMm2);
                indice = x;
            }
            if (array[fibMm2] > x) {
                fibM = fibMm1;
                fibMm1 = fibMm2;
                fibMm2 = fibM - fibMm1;
            }
            if (array[fibMm2] < x){
                fibM = fibM + fibMm1;
                fibMm1 = fibMm1 + fibMm2;
                fibMm2 = fibM - fibMm1;
                if(fibMm2 >= array.length){
                    fibMm2 = array.length -1;
                }
            }
        }while(indice != x);
    }
}