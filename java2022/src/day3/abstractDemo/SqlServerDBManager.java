package day3.abstractDemo;

public class SqlServerDBManager extends BaseDatabaseManager{
    @Override
    public void getData() {
        System.out.println("MS Sql Server database data fetched.");
    }
}
