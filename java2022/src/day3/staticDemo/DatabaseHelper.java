package day3.staticDemo;

public class DatabaseHelper {
    // ana class static olamaz. ancak inner class, static olabilir.
    public static class CRUD{
        public static void Create(){
            System.out.println("Created.");
        }

        public static void Read(){
            System.out.println("Read.");
        }

        public static void Update(){
            System.out.println("Updated.");
        }

        public static void Delete(){
            System.out.println("Deleted.");
        }
    }
}
