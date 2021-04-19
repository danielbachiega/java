import java.util.Scanner;
public class Funcoes {
    
/*6. A multiplicação de dois numeros inteiros pode ser feita através de somas sucessivas. ´
Proponha um algoritmo recursivo Multip_Rec(n1,n2) que calcule a multiplicação de dois ˜
inteiros.*/

    public static int MultipRec(int n1, int n2) {
        if (n2==0 || n1 == 0 ){
        return 0;
    }
        return n1+MultipRec(n1, n2-1);
    }

/*10. Faça uma função recursiva que receba um número inteiro positivo par N e imprima todos ´
os numeros pares de 0 até N em ordem decrescente.*/
private static int[] resultado;
private static int i=0;
    public static int Ex10 (int n){
        if (i==0){
            resultado= new int [(n/2)+1]; 
        }
        if(n==0){
            resultado[i]=0;
            for (int aux : resultado) {
                System.out.print(aux + ", ");
            }
            return 0;
      }
        if(n%2!=0){
          n=n-1;
      }
      resultado[i++]=n;
      return Ex10(n-2);

    }

/* 11. Escreva uma funcão recursiva que exibe todos os elementos em um array de inteiros, ˜
separados por espaço */ 
    public static int Ex11 (int[] n){
        if(i==n.length){
            return 0;
            }
        int aux=n[i++];
        System.out.print(aux + " ");
        return Ex11(n);    
    }

/*16. Faça uma função recursiva que receba um numero inteiro positivo impar N e retorne ´
o fatorial duplo desse numero. O fatorial duplo é definido como o produto de todos os ´
numeros naturais ımpares de 1 ate algum numero natural ımpar N. Assim, o fatorial duplo
de 5 é
5!! = 1 ∗ 3 ∗ 5 = 15 */
public static int Ex16 (int n){
    if(n==0 || n%2==0){
        System.out.println("Numero invalido");
        return n;
    }
    if(n==1){
        return 1;
    }
    return i=n*Ex16(n-2);
}



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        
        System.out.println("\ndigite o numero n1: ");
        int n=scanner.nextInt();
       
        
        System.out.println(Ex16(n));
        scanner.close();
    }
    
}
