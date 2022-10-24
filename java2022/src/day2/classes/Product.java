package day2.classes;

public class Product {

    public Product(){
        System.out.println("Default Constructor initialized..");
        // bu biz olusturmasakta Java'nin yarattigi default constructor.
    }

    public Product(int id, String name, String description, double price, int stockAmount, String color){
        /*
         burada ise kendimiz constructor'i overload ederek nesnenin bu sekilde de initialize edilebilecegini
         ayarlamis oluruz
        */

        System.out.println("Overloaded Constructor initialized..!");

        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.stockAmount = stockAmount;
        this.color = color;
    }

    //attributes and fields
    private int id;
    private String name;
    private String description;
    private double price;
    private int stockAmount;
    private String color;
    private String code;

    // getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // burada sadece readonly olmasini istedigimizden setter'ini yazmadik.
    public String getCode() {
        //kodu olustururken urun adinin ilk harfi ve id sini birlestirmek istedik.
        return this.name.substring(0,1) + this.id;
    }

}
