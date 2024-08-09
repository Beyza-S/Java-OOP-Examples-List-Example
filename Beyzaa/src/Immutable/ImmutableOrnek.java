package Immutable;

public final class ImmutableOrnek {

    private final String name;
    private final int age;

    public ImmutableOrnek(String name,int age){
        this.name=name;
        this.age=age;
    }

    public String getname(){
        return name;
    }
    public int getage(){
        return age;
    }

}
