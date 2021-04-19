package ListaFila;

public class Lista {
    
    
        private No primeiro;
        private No ultimo;
        private int cont;
        // manutenção cont nas inserções e remoções
        public ListaDupla () {
            this.setCont(0);
            this.setPrimeiro(null);
            this.setUltimo(null);
        }
    
        public No getPrimeiro() {
            return primeiro;
        }
    
        public void setPrimeiro(No primeiro) {
            this.primeiro = primeiro;
        }
    
        public No getUltimo() {
            return ultimo;
        }
    
        public void setUltimo(No ultimo) {
            this.ultimo = ultimo;
        }
    
        public int getCont() {
            return cont;
        }
    
        public void setCont(int cont) {
            this.cont = cont;
        }
        
        public boolean estaVazia() {
            return (this.primeiro == null || this.ultimo == null);
        }
        public void insereInicio (int info) {
            No novo = new No(info);
            if (this.estaVazia()) {
                this.setUltimo(novo);
            }
            else {
                novo.setProximo(this.primeiro);
                this.primeiro.setAnterior(novo);
            }
            this.setPrimeiro(novo);
        }
        public void insereFim (int info) {
            No novo = new No(info);
            if (this.estaVazia()) {
                this.setPrimeiro(novo);
            }
            else {
                novo.setAnterior(this.ultimo);
                this.ultimo.setProximo(novo);
            }
            this.setUltimo(novo);
        }
        public int removeInicio () {
            int aux = this.getPrimeiro().getInfo();
            this.setPrimeiro(this.getPrimeiro().getProximo());
            if (this.estaVazia() ) {
                this.setUltimo(null);
            }
            else {
                this.getPrimeiro().setAnterior(null);
            }
            return aux;
        }
        
        public int removeFim () {
            int aux = this.getUltimo().getInfo();
            this.setUltimo(this.getUltimo().getAnterior());
            if (this.estaVazia() ) {
                this.setPrimeiro(null);
            }
            else {
                this.getUltimo().setProximo(null);
            }
            return aux;
        }
       //tostring nao esta funcionndo direito 
    @Override
    public String toString(){
        String stringAux= "Lista: [";
        if(this.estaVazia()){
            stringAux = stringAux + "vazia";
        }
        else{
            No noAux=this.getUltimo();
            while(noAux != null){
                stringAux=stringAux+noAux +" ";
                noAux=noAux.getAnterior();
            }
        
        }
        stringAux=stringAux +"]";
        return stringAux;
        
        
    }
            
        
}