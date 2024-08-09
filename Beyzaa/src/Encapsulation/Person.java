package Encapsulation;

public class Person {
    private String name;
    private int age;

    //Yapıcı method Constructor

    public Person(String name,int age){
        this.name=name;
        this.age=age;

    }

    //Getter-Setter

    public String getname(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public int getage(){
        return age;
    }

    public void setage(int age){
        if(age>0){
            this.age= age;
        }
        else{
            System.out.println("Hatalı yaş aralığı");
        }
    }
    public void yazdir(){
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
    }


}
