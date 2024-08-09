package Polymorphism;

public  class Ucgen extends Shape{

    private double taban,yukseklik;
    private double kenar1,kenar2,kenar3;

    public Ucgen(double taban,double yukseklik,double kenar1,double kenar2,double kenar3){
        this.taban=taban;
        this.yukseklik=yukseklik;
        this.kenar1=kenar1;
        this.kenar2=kenar2;
        this.kenar3=kenar3;
    }

    @Override
    public double alan() {
        return taban * yukseklik * 0.5;
    }

    @Override
    public double cevre(){
        return (kenar1+kenar2+kenar3);
    }
}
