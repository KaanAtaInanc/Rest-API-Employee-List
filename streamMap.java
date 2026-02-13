import java.util.List;
import java.util.stream.Collectors;

public class streamMap {
    public static void main(String[] args){ //Programın Çalışabilmesi İçin Gereken Fonksiyondur


        //Haritalandırma (MAP) İşlemi Örnekleri
        List<Integer>numbers=List.of(2,3,4,5,6);


        //Haritalandırma da Her değer için (değişken) için atama yapılaiblir

        //Mapping (Haritalandırma) yöntemi ile Sayıların Karesini Alma
        List<Integer>kareAlmaSayılar= numbers.stream()
                .map(n -> n*n)
                .collect(Collectors.toList());
        System.out.println("Karesi Alınacak Sayıların Listesi\n"+numbers);
        System.out.println(kareAlmaSayılar+"\n");


        System.out.println("----------------------------------------");

        //Mapping İle Kelimelerin Uzunluklarının Hesaplanması
        List<String>kelimeler=List.of("Java","C#","Python","Flutter","Dart","Kotlin","C++","Deep Learning","API");

        //Kelime Uzunluğu Hesaplanması
        List<Integer>uzunluk=kelimeler.stream()
                .map(String::length)
                .collect(Collectors.toList());
        System.out.println("Kelimelerin Uzunlukları\n"+kelimeler);
        System.out.println(uzunluk); //Burada İlk Değişken İsmi (Örnekte uzunluk) yazılmalı ki program doğru çıktı üretsin

    }
}
