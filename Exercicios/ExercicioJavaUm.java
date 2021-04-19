import java.util.Scanner;

public class ExercicioJavaUm {
    public static void main(String[] args){
        int i[]= new int[3];
        int cont;

        for(cont=0;cont<3;cont++){
        Scanner entrada = new Scanner(System.in);
        System.out.println("digite o "+(cont+1)+"º inteiro: ");
        i[cont] = entrada.nextInt();
    }
    if(i[0]<i[1] && i[0]<i[2]){
        if(i[1]<i[2]){
            System.out.println("O menor numero é "+ i[0]+" e o maior é "+i[2]); 
        }
        else{
            System.out.println("O menor numero é "+ i[0]+" e o maior é "+i[1]);
        }
    }
        else{
            if(i[1]<i[0] && i[1]<i[2]){
                if(i[0]<i[2]){
                    System.out.println("O menor numero é "+ i[1]+" e o maior é "+i[2]);
                }
                else{
                    System.out.println("O menor numero é "+ i[1]+" e o maior é "+i[0]);
                }
            }
            else{
                if(i[0]<i[1]){
                    System.out.println("O menor numero é "+ i[2]+" e o maior é "+i[1]);
                }
                else{
                    System.out.println("O menor numero é "+ i[2]+" e o maior é "+i[0]);
                }
            }
        }
    
}
entrada.close();   
}
