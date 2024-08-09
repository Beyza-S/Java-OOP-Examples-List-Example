package Map;

import java.util.HashMap;
import java.util.Map;

public class HashMapOrnek {

    public static void main(String[] args) {

        Map<String,Integer> map=new HashMap<>();

        //Anahtar değer çiftlerini ekleme

        map.put("Elma",3);
        map.put("Muz",2);
        map.put("Çilek",5);

        //Değere anahtar ile erişim
        System.out.println("Elma:"+map.get("Elma"));  //3

        //Tüm anahtar değer çiftlerini yazdırma
        for(Map.Entry<String,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey()+ ":" +entry.getValue());
        }

        map.remove("Muz");
    }
}







