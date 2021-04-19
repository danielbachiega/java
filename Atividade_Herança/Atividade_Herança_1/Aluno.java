public class Aluno extends Pessoa {
    private String semestre;
    private String curso;

    public Aluno (String n, int id, String end, String sem, String c){
        super (n, id, end);
        this.setSemestre (sem);
        this.setCurso (c);
    }
   
    public void setSemestre (String sem){
        semestre = sem;
    }

    public void setCurso (String c){
        curso = c;
    }

    public String getSemestre () {
        return this.semestre;
    }

    public String getCurso () {
        return this.curso;
    }

    @Override
    public String toString () {
        return super.toString() + "\nSemestre e curso do Aluno: " + semestre + ", " + curso + "\n";
    }
}
