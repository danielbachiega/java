import java.util.Scanner;

public class ExercicioJavaTres {
    public static void main(String[] args){
        int i[]= new int[3];
        int cont;

        
        Scanner entrada = new Scanner(System.in);
        System.out.println("digite quantidade de anos: ");
        i[0] = entrada.nextInt();

        System.out.println("digite quantidade de meses: ");
        i[1] = entrada.nextInt();

        System.out.println("digite quantidade de dias: ");
        i[2] = entrada.nextInt();

        cont= (i[0]*365)+(i[1]*30)+i[2];
        System.out.println(i[0]+" anos, "+i[1]+" meses e"+i[2]+"dias possui um total de "+ cont+" dias.");


    }
    
}
