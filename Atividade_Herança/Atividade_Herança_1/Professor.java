public class Professor extends Funcionario {
    private String disciplina;

    public Professor(String n, int id, String end, double sal, String dis) {
        super(n, id, end, sal);        
        this.setDisciplina (dis);    
    }

    public String getDisciplina () {
        return this.disciplina;
    }

    public void setDisciplina (String dis) {
        disciplina = dis;
    }

    @Override
    public String toString () {
        return super.toString() + "\nProfessor(a) de: " + disciplina + "\n";
    }
}