package day2.classes;

public class Main {
    public static void main(String[] args) {
        //default constructor
        Product prod = new Product();
        prod.setId(1);
        prod.setDescription("Apple");
        prod.setColor("Magenta");
        prod.setPrice(1199.99);
        prod.setName("MacBook");
        prod.setStockAmount(20);

        System.out.println(prod.getCode()); // default constructor ile olusturulan nesneden gelen

        // overloaded constructor
        Product productTwo = new Product(2, "Dell", "Windows PC", 899.99, 10, "Black");

        System.out.println(productTwo.getCode()); // overloaded constructor ile olusturulan nesneden gelen

        ProductManager pm = new ProductManager();
        pm.add(productTwo);
        pm.add(prod);

    }
}

