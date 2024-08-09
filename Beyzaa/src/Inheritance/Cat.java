package Inheritance;

public class Cat extends Animal{

    public Cat(String name, int age){
        super(name,age);
    }

    public void top(){
        System.out.println(getname()+ " topu yakalayabilir.");
    }

    @Override
    public void animalses(){

        System.out.println("Miav!");
    }


}
