package day2;

public class MethodsWithParameters {
    public static void main(String[] args) {
        String message = "Today weather is awesome...";
        System.out.println(sum(10,20));
        add();
        delete();
        update(message);

    }

    public static void add(){
        System.out.println("Item Added.");
    }

    public static  void delete(){
        System.out.println("Item Deleted.");
    }

    public  static void update(String item){
        System.out.println(item + "--> Item Updated.");
    }

    // deger donduren fonksiyonlarda return kullanilir
    public static int sum(int num1, int num2){
        int toplam = num1 + num2;
        return toplam;
    }
}
