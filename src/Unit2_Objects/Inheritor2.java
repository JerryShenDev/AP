package Unit2_Objects;

public class Inheritor2 extends Example{
    private double s;
    public Inheritor2(double s, int integer2){
        super(integer2);
        this.s = s;
    }
    public double getS(){
        return this.s;
    }
    public void setS(double s){
        this.s = s;
    }
}
