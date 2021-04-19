public class TesteFormas {

    public static void main(String args[]){
        Formas[] teste =new Formas[3];
        teste[0]= new Circulo(10.0);
        teste[1]= new Retangulo(3.0,5.0);
        teste[2]= new Triangulo(4.0,10.0);

        for(Formas a: teste){
            System.out.println(a);
        }
    }
    
}
