package day3.staticDemo;

public class ProductValidator {
    static {
        System.out.println("Static constructor called.");
    }
    public ProductValidator() {
        System.out.println("Standart constructor called.");
    }

    // bir metodu static yaptigimizda direkt sinif ismi ile cagirabiliriz.
    // static , new gibidir ancak farkı uygulama kapatılana kadar bellekten silinmez. new'de ise uretilen nesne
    // kullanımı bittigi anda bellekten silinir. Bu yuzden is katmani gibi kisimlarda static kullanilmaz. daha
    // cok yardimci araclar olusturuldugunda kullanilan bir yapidir.

    public static boolean isValid(Product product){
        if (product.price > 0 && !product.name.isEmpty()){
            // isEmpty() ==> bossa, girilmemisse
            return true;
        }
        else return false;
    }


}
