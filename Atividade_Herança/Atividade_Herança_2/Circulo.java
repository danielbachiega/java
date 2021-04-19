

public class Circulo extends Formas{
 

    private double perimetro;
    
   
    public Circulo(double diametro){
        super(diametro);
        this.perimetro= calculoPerimetro(diametro,getPi());
    }
    
    public double calculoPerimetro(double diametro, double pi){
        return ((diametro/2)*(diametro/2))*pi;
    }
  
    @Override
    public double calculoArea(double diametro, double pi) {
    
        return (diametro*pi);
    }
    @Override
    public String toString(){
        return "Circulo Dimencoes\nDiametro: " + super.getA() +  super.toString()+" Perimetro: " + perimetro;
    }
}
