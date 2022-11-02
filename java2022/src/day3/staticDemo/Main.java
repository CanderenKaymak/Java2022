package day3.staticDemo;

public class Main {
    public static void main(String[] args) {
        ProductManager manager = new ProductManager();
        Product product = new Product();
        product.name = "Mouse";
        product.price = 123;

        manager.add(product);

        DatabaseHelper.CRUD.Read();
        DatabaseHelper.CRUD.Create();
        DatabaseHelper.CRUD.Delete();
        DatabaseHelper.CRUD.Update();

    }
}
