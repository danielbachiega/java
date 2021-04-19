package ListaPilha;

public class Lista {
    private No primeiro;
    
    public Lista(){
        this.setPrimeiro(null);
    }
    public No getPrimeiro(){
        return this.primeiro;
    }
    public void setPrimeiro(No no){
        this.primeiro=no;
    }
    

    public boolean estaVazia(){
        return this.getPrimeiro()==null;
    }
    public void insereInicio(int info){
        No novo=new No(info);
        if (!this.estaVazia()){
            novo.setProximo(this.getPrimeiro());
        }
            this.setPrimeiro(novo);
    }
    public int removeInicio(){
        int removido= this.getPrimeiro().getInfo();
        this.setPrimeiro(this.getPrimeiro().getProximo());
        return removido;
    }
    
@Override
public String toString(){
    String stringAux= "Lista: [";
    if(this.estaVazia()){
        stringAux = stringAux + "vazia";
    }
    else{
        No noAux=this.getPrimeiro();
        while(noAux != null){
            stringAux=stringAux+noAux +" ";
            noAux=noAux.getProximo();
        }

    }
    stringAux=stringAux +"]";
    return stringAux;
}
    
}
