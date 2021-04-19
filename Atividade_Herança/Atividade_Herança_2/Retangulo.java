public class Retangulo extends Formas{
    private double perimetro;
    public Retangulo(double altura, double base){
        super(altura,base);
        this.perimetro= calculoPerimetro(altura,base);
    }
    public double calculoPerimetro(double altura, double base){
        return 2*altura+2*base;
    }
    @Override
    public String toString(){
        return "Retangulo Dimencoes\nAltura: " + super.getA() + " Base: " + super.getB() + super.toString()+" Perimetro: " + perimetro;
    }
}
