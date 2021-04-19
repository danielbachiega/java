import java.util.Scanner;


public class ExercicioJavaCinco {
    public static void main(String[] args){
    
        int m;
        int n; 
        int cont;
        int soma=0;

        Scanner entrada = new Scanner(System.in);
        
        do{
            System.out.println("digite valor M: ");
            m = entrada.nextInt();
            System.out.println("digite valor N: ");
            n = entrada.nextInt();
            if(m>n){
                soma+= m;
                for(cont=n;cont<m;cont++){
                    soma+= n;
                    n++;

                }
            }
            else{
                break;
            }
            System.out.println("ovalor da soma é: "+soma);
       }while(n >= m);
       
}
}