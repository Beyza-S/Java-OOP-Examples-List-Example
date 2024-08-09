package List;

import java.util.List;
import java.util.ArrayList;

public class ArrayListOrnek {
    public static void main(String[] args) {

        //ArrayList oluşturma

        List <String> list =new ArrayList<>();

        //Eleman Ekleme

        list.add("Elma");
        list.add("Muz");
        list.add("Çilek");

        System.out.println("List:"+list);

        //Belirli bir indekse eleman ekleme

        list.add(1,"Portakal");
        System.out.println("1 nolu yere portakal ekledikten sonra list:"+list);

        //Elemanları alma

        String ilkEleman=list.get(0);
        System.out.println("Birinci  element:"+ilkEleman);

        //Elemanları değiştirme

        list.set(2,"Üzüm");
        System.out.println("2.indeksi üzümle değiştirdikten sonra list:"+list);


        //Elemanları çıkarma

        list.remove("Muz");
        System.out.println("Muzu çıkardıktan sonra list:"+list);
        list.remove(2);
        System.out.println("2.indeksi çıkardıktan sonra list:"+list);

        //Listenin boyutu

        int size=list.size();
        System.out.println("Listenin boyutu:"+size);

        //Listenin boş olup olmadığını kontrol etme
        boolean bosMu=list.isEmpty();
        System.out.println("Liste boş mu?:"+bosMu);

        //Belirli bir elemanın olup olmadığını kontrol etme
        boolean varMiElma=list.contains("Elma");
        System.out.println("Elma var mı?:"+varMiElma);


    }
}
