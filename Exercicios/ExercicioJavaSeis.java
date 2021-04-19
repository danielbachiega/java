import javax.swing.JOptionPane;
public class ExercicioJavaSeis {
    public static void main(String[] args){
        int i[]= new int[3];
        int m;
        String s = JOptionPane.showInputDialog(null,"Digite a primeira nota");
        i[0] = Integer.parseInt(s);
        s = JOptionPane.showInputDialog(null,"Digite a segunda nota");
        i[1] = Integer.parseInt(s);
        s = JOptionPane.showInputDialog(null,"Digite a terceira nota");
        i[2] = Integer.parseInt(s);
        
        m=(i[0]+i[1]+i[2])/3;
        
        if(m<2){
            JOptionPane.showMessageDialog(null,"Reprovado! Media: "+m); 
        }
        else{
            if(2<=m && m<6){
                JOptionPane.showMessageDialog(null,"Exame! Media: "+m);
            }
            else{
                JOptionPane.showMessageDialog(null,"Aprovado! Media: "+m);
            }
        }

    }
    
}
