
// STREAM API DA FİLTRELEME, SIRALAMA, HARİTALAMA işlemleri

import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;

public class filtreSiralaHaritala {
    public static void main(String[] args){
        //Sayılar Adlı Listeden 30'dan büyük değerleri sıralama işlemi
        List<Integer> numbers = List.of(10,20,30,40,50,60,70,80,90); //Sayılar Listesi ve Elemanlarının Tanınması

        //Filtreleme için fonksiyon tanımlayarak bir Stream Mimarisi Yazımı
        List<Integer> filtreNumber=numbers.stream()
                .filter(n-> n >30) //Listede 30 dan büyük elemanların filtrelenmesi
                .collect(Collectors.toList()); //Elemanların Liste yolu ile paketlenmesi


        System.out.println(filtreNumber); //Filtre Sonucunun Ekrana Çıktı Vermesi
    }
}

