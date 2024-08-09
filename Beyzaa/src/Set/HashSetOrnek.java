package Set;

import java.util.HashSet;
import java.util.Set;

public class HashSetOrnek {
    public static void main(String[] args) {

        Set <String> set=new HashSet<>();

        //Eleman ekle

        set.add("Elma");
        set.add("Muz");

        //Eleman Çıkar

        set.remove("Muz");


        //Eleman var mı

        boolean varMiElma=set.contains("Elma");





    }



}
