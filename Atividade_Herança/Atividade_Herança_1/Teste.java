public class Teste {
    
    public static void main (String args []){
        
        Aluno [] a = new Aluno [1];
        Professor [] p = new Professor [1];
        FuncAdm [] f = new FuncAdm [1];


        a[0] = new Aluno ("Daniel dos Santos", 20, "Barueri", "3o Semestre", "ADS");
        p[0] = new Professor ("Machion", 30, "Carapicuiba", 3000, "Estrutura de Dados");
        f[0] = new FuncAdm("Jose", 40, "Osasco", 2000, "Secretaria", "Coordenador");

        System.out.println(a[0]);
        System.out.println(p[0]);
        System.out.println(f[0]);
        
    }
}
