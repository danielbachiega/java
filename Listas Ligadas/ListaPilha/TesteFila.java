package ListaPilha;

public class TesteFila {
    public static void main(String[]args) {

        Lista l= new Lista();

        l.insereInicio(4);
        l.insereInicio(21);
        l.insereInicio(12);

        System.out.println(l);

        if(!l.estaVazia()){
            System.out.println(l.removeInicio()+" foi removido");
            System.out.println(l);
        }
        else{
            System.out.println("Lista vazia, não ha como remover");
        }
        while(!l.estaVazia()){
            System.out.println(l.removeInicio()+" foi removido");
            System.out.println(l);
        }
    }
    

    
}
