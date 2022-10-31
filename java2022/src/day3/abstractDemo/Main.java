package day3.abstractDemo;

public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();
        customerManager.databaseManager = new OracleDBManager();// burada konfigurasyon degistigini varsayabiliriz.
        // Eger SqlServer dan data alinacaksa onun instance'i turetildiginde oradan veri cekilmis olur.

        customerManager.getCustomers();
    }
}
