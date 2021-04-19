import java.text.DecimalFormat;
import java.lang.Math;
public class Triangulo extends Formas {
    private double h;
    private double perimetro;
    public Triangulo(double altura, double base){
        super(altura,base);
        this.setH(altura,base);
        this.perimetro= calculoPerimetro(altura,base);
    }
    public void setH(double altura, double base){
        this.h= Math.sqrt(((altura*altura)+(base*base)));
    }
    public double getH(){
        return h;
    }
    public double calculoPerimetro(double altura, double base){
        double aux;
        aux=(getH()+altura+base);
        return aux;
    }
    @Override
    public double calculoArea(double altura, double base) {
    
        return (super.calculoArea(altura, base)/2);
    }
    @Override
    public String toString(){
        
        return "Triangulo Dimencoes\nAltura: " + super.getA() + " Base: " + super.getB() +" Hipotenusa: "+ new DecimalFormat("#0.##").format( getH() ) + super.toString()+" Perimetro: " + new DecimalFormat("#0.##").format( perimetro );
    }
}
