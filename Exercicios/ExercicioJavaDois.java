import java.util.Scanner;

public class ExercicioJavaDois {
    public static void main(String[] args){
        int i[]= new int[10];
        int cont;

        for(cont=0;cont<10;cont++){
            Scanner entrada = new Scanner(System.in);
            System.out.println("digite o "+(cont+1)+"º inteiro: ");
            i[cont] = entrada.nextInt();
        }
        for(cont=9;cont>=0;cont--){
            System.out.println("O "+(cont+1)+"º inteiro: "+i[cont]);
        }
    }
}
