package Interface;

public class Bicycle implements Vehicle {
    private double hiz;
    private int kapasite;

    public Bicycle(double hiz, int kapasite) {
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
        System.out.println("Bisiklet Hızı: " + getHiz() + " km/h");
        System.out.println("Bisiklet Kapasitesi: " + getKapasite() + " persons");
    }
}
