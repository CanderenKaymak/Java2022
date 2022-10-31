package day3.abstractDemo;

public class MySqlDBManager extends BaseDatabaseManager{
    // MySql sinifini sonradan ekledik ve hicbir eski gelistirmeye mudahale etmeden bu ozelligide eklemis olduk.
    @Override
    public void getData() {
        System.out.println("MySql data Fetched.");
    }
}
