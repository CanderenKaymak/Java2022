package day1;

public class StringsDemo {
    public static void main(String[] args) {
        String message = "The weather is beautiful today..";
        System.out.println(message);

        // Video 17

        System.out.println("Character count: " + message.length());

        System.out.println("5th letter: " + message.charAt(4));

        System.out.println(message.concat(" Hurray!!")); // burada 'message' değismez. bu metni yeni haliyele
        // kullanmak icin yeni bir String degiskene atamamiz gerekli

        System.out.println(message.startsWith("T"));
        System.out.println(message.endsWith("y"));

        char[] charArray = new char[5];
        message.getChars(0,5,charArray,0);
        System.out.println(charArray);

        System.out.println(message);
        System.out.println(message.indexOf("ea"));
        System.out.println(message.lastIndexOf('y')); // aramaya sondan baslar ama index numarasini bastan sayar.

        //Video 18
        System.out.println(message.replace(' ', '-')); // eski karakterlerin tamamini yeni karakterle degistirir.

        System.out.println(message.substring(4)); // indexten itibaren - Ciktisi: weather is beautiful today..
        System.out.println(message.substring(12,15)); // indexler arasini yazar - Ciktisi: is

        for (String letter : message.split(" ")){
            System.out.println(letter);
        }

        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());

        System.out.println(message.trim()); // cumlenin basindaki ve sonundaki boluklari alabaliriz.
    }
}
