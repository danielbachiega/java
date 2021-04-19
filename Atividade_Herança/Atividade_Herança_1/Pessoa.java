public class Pessoa {
    private String nome;
    private int idade;
    private String endereco;

    public Pessoa (String n, int id, String end){
        this.setNome(n);
        this.setIdade(id);
        this.setEndereco(end);
    }
    public void setNome (String n){
        nome = n;
    }
    public void setIdade (int id){
        idade = id;
    }
    public void setEndereco (String end){
        endereco = end;
    }

    public String getNome () {
        return this.nome;
    }
    public int getIdade () {
        return this.idade;
    }
    public String getEndereco () {
        return this.endereco;
    }
    
    @Override
    public String toString () {
        return "Nome, idade, endereco: " + nome + ", " + idade + ", " + endereco;
    }
    
}

