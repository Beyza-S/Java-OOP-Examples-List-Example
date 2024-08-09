package Polymorphism;

public class Dikdortgen extends Shape{

    public double uzunkenar;
    public double kisakenar;

    public Dikdortgen(double uzunkenar, double kisakenar){
        this.uzunkenar=uzunkenar;
        this.kisakenar=kisakenar;
    }
    @Override
    public double alan(){
        return uzunkenar*kisakenar;
    }

    @Override
    public double cevre() {
        return 2*(uzunkenar + kisakenar);
    }
}
