package day3.kodlamaNLayeredHomeWork.core.logging;

public class FileLogger implements Logger{
    @Override
    public void log(String data) {
        System.out.println("Log.txt file transferred to My Documents: " + data);
        System.out.println();
    }
}
