package day3.kodlamaNLayeredHomeWork.core.logging;

public class DBLogger implements Logger{
    @Override
    public void log(String data) {
        System.out.println("Log.txt file transferred to DataBase: " + data);
    }
}
