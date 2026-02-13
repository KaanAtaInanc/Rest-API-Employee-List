
//Stream API ile Filtreleme Örnekleri

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPI {
    public static void main(String[] args){

        List<String> isimler = Arrays.asList("Ali","Ömer","Faruk","Ayşe","Mehmet");

        //A İle Başlayan İsimleri Listeleme
        List<String> aHarfi = isimler.stream()
                .filter(isim -> isim.startsWith("A"))
                .collect(Collectors.toList());


        System.out.println(aHarfi);

    }
}
