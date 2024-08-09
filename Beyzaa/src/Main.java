import Encapsulation.Person;
import Inheritance.Animal;
import Inheritance.Cat;
import Inheritance.Dog;
import Interface.Bicycle;
import Interface.Car;
import Interface.Vehicle;
import O.AlanHesap;
import O.Dairee;
import Polymorphism.Dikdortgen;
import Polymorphism.Shape;
import Polymorphism.Ucgen;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {



        System.out.println("ENCAPSULATION PERSON ORNEGI");

        Person person = new Person("Beyza", 22);

        //Getter methodlarını kullanmak
        System.out.println("İsim:" + person.getname());
        System.out.println("Yaş:" + person.getage());

        //Setter methodlarını kullanmak
        person.setName("Beyza");
        person.setage(25);

        //yeni değerleri yazdır
        person.yazdir();

        System.out.println("INHERITANCE ANIMAL ORNEGI");

        //Animal sınıfından nesne oluşturma

        Animal animal = new Animal("Alman Kurdu", 5);
        animal.yazdiranimal();
        animal.animalses();

        //Dog sınıfından nesne oluşturma

        Dog dog = new Dog("Buddy", 3);
        dog.yazdiranimal();
        dog.animalses();
        dog.top();

        //Cat sınıfından nesne oluşturma

        Cat cat = new Cat("Tekir", 6);
        cat.yazdiranimal();
        cat.animalses();
        cat.top();

        System.out.println("POLYMORPHISM ALAN CEVRE ORNEGI");

        Shape[] shapes =new Shape[2];
        shapes[0]=new Dikdortgen(5,6);
        shapes[1]=new Ucgen(5,6,7,8,9);

        //Polimorfizmi gösteren döngü her nesne için hesap metodunu çağırır.
        for(Shape shape:shapes){
            shape.yazdirhesap();
            System.out.println();
        }

        Vehicle[] vehicles=new Vehicle[2];
        vehicles[0]=new Car(120,5);
        vehicles[1]=new Bicycle(30,1);

        for(Vehicle vehicle : vehicles){
            vehicle.aracyazdir();
            System.out.println();
        }


        System.out.println("O ORNEK KULLANIMI");

        Dikdortgen dikdortgen = new Dikdortgen(5, 10);
        Dairee daire = new Dairee(3);
        AlanHesap alanHesap = new AlanHesap();

        System.out.println("Daire Alani: " + alanHesap.hesaplaa(daire));



    }
}