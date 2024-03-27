package Unit2_Objects;

public class Tea {
    private String type;
    private double vol;

    public Tea(String type, double vol){
        this.type = type;
        this.vol = vol;
    }
    public double getVol(){
        return this.vol;
    }
    public void setVol(double newVol){
        this.vol = newVol;
    }

    public void drink(int sips){
        for (int i = 0; i < sips; i++){
            System.out.println(this.vol);
            this.vol -= Math.random()*10;
        }
    }
}
