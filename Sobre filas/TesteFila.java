package Fila;

import java.util.Random;

public class TesteFila {
    public static void main (String args[]) {
        Fila f = new Fila(8);
        Random random = new Random();
        do {
            if (random.nextInt(2)==1) {
                if (!f.filaCheia()) {
                    f.insereFila(random.nextInt(10));
                }
            }
            else {
                if (!f.filaVazia()) {
                    System.out.println(f.removeFila() + " foi atendido");
                }
            }
           
            System.out.println(f);
        } while (!f.filaVazia());
    }
}
