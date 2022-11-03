package day3.kodlamaNLayeredHomeWork.core.logging;

public class MailLogger implements Logger{
    @Override
    public void log(String data) {
        System.out.println("Log.txt file send to related mail: " + data);
    }
}
