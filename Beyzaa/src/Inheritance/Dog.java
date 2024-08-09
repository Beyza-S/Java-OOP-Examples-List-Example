package Inheritance;

public class Dog extends Animal{

    public Dog (String name,int age){
        super(name,age);
    }

    public void top(){
        System.out.println(getname()+" topu yakalayabilir.");
        //Aynı sınıf içine olduğumuz için dog.getname() dememe gerek yok.
    }

    @Override
    public void animalses(){

        System.out.println("Woof!");
    }

    @Override
    public void yazdiranimal(){
        super.yazdiranimal();
    }
}
