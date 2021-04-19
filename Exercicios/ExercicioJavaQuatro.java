import java.util.Scanner;
public class ExercicioJavaQuatro {
    public static void main(String[] args){
        int i[]= new int[6];

         Scanner entrada = new Scanner(System.in);
         System.out.println("digite o ano da primeira data: ");
         i[0] = entrada.nextInt();
         System.out.println("digite o mes da primeira data: ");
         i[1] = entrada.nextInt();
         System.out.println("digite o dia da primeira data: ");
         i[2] = entrada.nextInt();
         System.out.println("digite o ano da segunda data: ");
         i[3] = entrada.nextInt();
         System.out.println("digite o mes da segunda data: ");
         i[4] = entrada.nextInt();
         System.out.println("digite o dia da segunda data: ");
         i[5] = entrada.nextInt();

         if(i[0]>i[3]){
            System.out.println("A primeira data é maior");
         }
         else{
             if(i[0]<i[3]){
                System.out.println("A segunda data é maior");       
             }
             else{
                 if(i[1]>i[4]){
                    System.out.println("A primeira data é maior");
                 }
                 else{
                    if(i[1]<i[4]){
                        System.out.println("A segunda data é maior");
                    }
                    else{
                        if(i[2]>i[5]){
                            System.out.println("A primeira data é maior");
                         }
                         else{
                            if(i[1]<i[4]){
                                System.out.println("A segunda data é maior");
                            }
                            else{
                                System.out.println("As datas são iguais");
                            }
                         }
                    }

                 }
             }
         }
    }
}