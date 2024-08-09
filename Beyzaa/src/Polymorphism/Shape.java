package Polymorphism;

public abstract class Shape {

    //Soyut metot:Alt sınıfların kesin yapması gerekli

    public abstract double alan();
    public abstract double cevre();

    public void yazdirhesap(){
        System.out.println("Alan:"+alan());
        System.out.println("Çevre:"+cevre());
    }



}
