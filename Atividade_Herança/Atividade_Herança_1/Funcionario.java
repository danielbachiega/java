public class Funcionario extends Pessoa{
    private double salario;

    public Funcionario (String n, int id, String end, double sal) {
        super (n, id, end);
            this.setSalario(sal);
    }
    
    public Double getSalario () {
        return this.salario;
    }
    
    public void setSalario (double sal) {
        salario = sal;
    }
    @Override
    public String toString () {
        return super.toString() + "\nSalario: " + salario;
    }
}