package day2.classes;

public class ProductManager {
    public void add(Product product){
        // burada JDBC
        System.out.println("Product added --> " + product.getName());
    }
}
