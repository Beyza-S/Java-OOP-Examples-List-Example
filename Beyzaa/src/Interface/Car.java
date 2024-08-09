package Interface;

public class Car implements Vehicle {
    private double hiz;
    private int kapasite;

    public Car(double hiz, int kapasite) {
        this.hiz = hiz;
        this.kapasite = kapasite;
    }

    @Override
    public double getHiz() {
        return hiz;
    }

    @Override
    public int getKapasite() {
        return kapasite;
    }

    @Override
    public void aracyazdir() {
        System.out.println("Araç Hızı: " + getHiz() + " km/h");
        System.out.println("Araç Kapasitesi: " + getKapasite() + " persons");
    }
}
