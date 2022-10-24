package day2;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        // metodu cagirdik
        findingNumber();
    }

    public static void findingNumber(){
        // eger bunu bir metoda almadan farkli yerlerde kullansaydik, bu fonksiyon uzerinde degisiklik yapmak
        // istedigimizde her kullandigimiz ayrı yer icin duzeltme yapmak zorunda kalirdik. bunun onune gecmek icin
        // metotlari kullaniyoruz.
        int[] numbers = new int[]{1,2,5,7,9,0};
        int searching = 5;

        if (!(Arrays.stream(numbers).anyMatch(value -> value == searching))) {
            System.out.println("number Not found");
        } else {
            System.out.println("number is existing.");
        }
    }
}
