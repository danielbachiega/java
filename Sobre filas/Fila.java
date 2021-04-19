package Fila;

public class Fila {
    private int dados[];
    private int primeiro=0;
    private int ultimo=0;
    private int cont=0;

    public Fila (int capacidade) {
        this.dados = new int[capacidade];
    }
    public Fila () {
        this.dados = new int[10];
    }
    int proximaPosicao (int pos) {
        return (pos+1) % this.dados.length;
    }
    public boolean filaVazia () {
        return this.cont==0;
    }
    public boolean filaCheia() {
        return this.cont == this.dados.length;
    }
    public void insereFila (int i) {
        this.dados[this.ultimo] = i;
        this.ultimo = proximaPosicao(this.ultimo);
        this.cont++;
    }
    public int removeFila () {
        int removido = this.dados[this.primeiro];
        this.primeiro = proximaPosicao(this.primeiro);
        this.cont--;
        return removido;
    }
    @Override
    public String toString () {
        String aux = "Fila: ";
        if (filaVazia()) {
            aux = aux + "vazia";
        }
        else {

            aux= aux+ "primeiro da fila:"+this.dados[this.primeiro]+" posicao: "+this.primeiro+"\nultimo da fila " +this.dados[this.ultimo]+" posicao: "+this.ultimo;
        }
        return aux;
    }
}
    