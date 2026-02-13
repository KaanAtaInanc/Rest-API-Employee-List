//Optional Sınıfı Nedir ?
//optional<T> sınıfı, Java 8 ile gelen bir özellik ve java.util paketinde bulunur
//Bir değişkenin null olup olmadığını kontrol etmek için sıkça kullanılır
//if(variable !=null) kontrollerine alternatif sunar


import java.util.Optional;

public class OptionalClass {
    public static void main(String[] args){
        //Örnek 1 Optional Sınıfı Temel Kullanımı
        Optional<String> optionalDegisken= Optional.of("Merhaba,Optional Class"); //Optional Class Tanımlanması
        optionalDegisken.ifPresent(System.out::println); //Optional Class dan Ekrana Çıktı Verdirtmek

        System.out.println("---------------------------------");

        //Örnek 2 Optional Sınıfı Oluşturma
        //-Optional.of(value); --> Null olmayan bir değer vererek optional oluşturulur
        Optional<String>optional=Optional.of("Java");
        optional.ifPresent(System.out::println);
        //-Eğer Null değer verilirse NullPointerException hatasını fırlatır
        Optional<String>optionalNull=Optional.ofNullable(null); //Boş null bir Optional deger döner
        optionalNull.ifPresent(System.out::println);

        System.out.println("---------------------------------");

        //Örnek 3 Optional.empty() bos bir optional döner
        Optional<String>optionalEmpty=Optional.empty();
        optionalEmpty.ifPresent(System.out::println);
        System.out.println("!!! 3.Örnek boş bir değerin döndürebildiğini göstermektedir !!!");

        System.out.println("---------------------------------");

        //Örnek 4 Optional İçinde Bulunan Değere Erişme (Bu işlem için get metodu kullanılır)
        //-get(): İçindeki Değeri Döndürmektedir.  !!Eğer null değer verilirse NoSuchElementException hatası alınır !!

        Optional<String>optionalGet=Optional.of("Python");
        System.out.println(optionalGet.get()); //Ekranda Python Çıktısı Alınır

        System.out.println("---------------------------------");

        //Örnek 5 --  isPresent() içinde değer olup olmadığını kontrol eden yapıdır

        //isPresent ta null değer varsa ekrana false null değer değilse (değer varsa) ekrana true değeri döndürür
        Optional<String>optionalPresent=Optional.ofNullable(null); //false
        System.out.println(optionalPresent.isPresent());//false (Değer Null İse false değer döndürür

        Optional<Integer>optionalPresent2=Optional.ofNullable(3); //true (Değer Null değil ise true döndürür
        System.out.println(optionalPresent2.isPresent());//true

        System.out.println("---------------------------------");

        //Örnek 6 Optional İle Stream ve Dönüştürme
        //-map(function) Optional içindeki degeri dönüştürmede kullanılır
        Optional<String>optionalStream=optional.of("Stream API");
        Optional<String>upperCase=optionalStream.map(String::toUpperCase); //STREAM API
        upperCase.ifPresent(System.out::println);

    }
}
