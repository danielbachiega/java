public class FuncAdm extends Funcionario {
    private String setor;
    private String funcao;

    public FuncAdm (String n, int id, String end, double sal, String s, String fun){
        super(n, id, end, sal);
        this.setSetor (s);
        this.setFuncao (fun);
    }

    public String getSetor () {
        return this.setor;
    }

    public String getFuncao () {
        return this.funcao;
    }

    public void setSetor (String s){
        setor = s;
    }

    public void setFuncao (String fun){
        funcao = fun;
    }

    @Override
    public String toString () {
        return super.toString() + "\nSetor: " + setor + "\nFuncao: " + funcao + "\n";
    }
}
