import java.util.List;
import java.util.stream.Collectors;

public class streamSort {
    public static void main(String[] args){
        List<Integer>numbers=List.of(10,75,33,30,45,60,25);

        // 1. Örnek Listedeki Sayıların Küçükten Büyüğe Sıralanması
        List<Integer>sortedNumber= numbers.stream() //sortednumber isimli bir Stream Tanımlanması
                .sorted() //
                .collect(Collectors.toList());

        System.out.println(sortedNumber);

        System.out.println("----------------------------");

        //2. Örnek Listedeki Sayıların Büyükten Küçüğe Sıralanması
        List<Integer>sortedDescending=numbers.stream() //sortedDescending metodu kullanarak Büyükten Küçüğe Sıralama Yapılır
                .sorted((a,b)-> b-a)
                .collect(Collectors.toList());
        System.out.println(sortedDescending);
    }
}
