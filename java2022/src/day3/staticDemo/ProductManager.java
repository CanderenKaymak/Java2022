package day3.staticDemo;

public class ProductManager {
    public void add(Product product){
        //ProductValidator validator = new ProductValidator();
        // static kullandigimiz icin direk sinif icerisinden cagirabildik. static kullanmazsak o siniftan bir
        // instance almamiz gerekir. burada onemli bir farkta standart yapıcı blok calismaz. ancak static icin ayri
        // bir constructor vardir. O calisir.

        if (ProductValidator.isValid(product)){
            System.out.println("Product added.");
        }
        else {
            System.out.println("Product info is invalid !");
        }

    }
}
