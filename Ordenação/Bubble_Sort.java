//import java.util.Arrays;
import java.util.Random;

public class Bubble_Sort{
    public static void main(String[] args){
        int[] v = VetRandom(1000000);
            
            long ini = System.currentTimeMillis();
            
            bubbleSort(v);       

            long fin = System.currentTimeMillis();

            System.out.println("Tempo: " + (fin - ini) + " ms");

            //System.out.println(Arrays.toString(v));                   //comando para mostrar o vetor já ordenado
  }
  
    public static int[] VetRandom(int aux){
        int [] v = new int[aux];
        Random gerador = new Random();
            for (int i = 0; i < aux; i++){
                v[i] = gerador.nextInt(1000000);
            }
            return v;
    }

    private static void bubbleSort(int v[]){
          boolean troca = true;
          int j;
            while (troca) {
              troca = false;
              for (int i = 0; i < v.length - 1; i++){
                  if (v[i] > v[i + 1]) {
                      j = v[i];
                      v[i] = v[i + 1];
                      v[i + 1] = j;
                      troca = true;
                    }
                }
            }
    }

}