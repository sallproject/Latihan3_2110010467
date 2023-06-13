package geometri;

public class Lingkaran {
    private double radius;
    
    public Lingkaran(double radius){
        this.radius = radius;
    }
    
    public double luas(){
        return Math.PI * radius * radius;
    }
    
    public double keliling(){
        return 2 * Math.PI * radius;
    }
}
