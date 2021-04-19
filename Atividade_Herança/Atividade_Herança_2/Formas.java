import java.text.DecimalFormat;
public class Formas {
    private double a;
    private double b;
    private double area;
    private double pi;

 
    
    public Formas ( double a, double b){
        this.setA(a);
        this.setB(b);
        this.area= calculoArea(a,b);
        
    }
    public Formas ( double a){
        this.setA(a);
        this.pi=3.14;
        this.area= calculoArea(a,pi);
    }

    public void setA(double a){
        this.a=a;
    }
    public void setB(double b){
        this.b=b;
    }
    public double getA() {
        return this.a;
    }
    public double getB() {
        return this.b;
    }
    public double getPi() {
        return this.pi;
    }
    public double calculoArea(double a, double b){
        this.area= this.a*this.b; 
        return area;
    }

@Override

public String toString(){
    return " area: "+ new DecimalFormat("#0.##").format( area ) ;
}
    
}
