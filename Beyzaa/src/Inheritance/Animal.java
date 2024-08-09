package Inheritance;

public class Animal {

    private String name;
    private int age;
    //Constructor
    public Animal(String name,int age){
        this.name=name;
        this.age=age;
    }

    public String getname(){
        return name;
    }
    public void setname(String name){
        this.name=name;
    }

    public int getage(){
        return age;
    }

    public void setage(int age){
        if(age>0){
            this.age=age;
        }else{
            System.out.println("Hatalı yaş aralığı");
        }
    }

    public void yazdiranimal(){
        System.out.println("Hayvan İsmi:"+name);
        System.out.println("Hayvan Yaşı:"+age);
    }
    //Ses çıkarma methodu
    public void animalses(){

        System.out.println("Hayvanın Sesi");
    }

}
