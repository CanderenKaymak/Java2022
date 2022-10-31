package day3.abstractDemo;

public abstract class BaseDatabaseManager {
    public abstract void getData();

    public final void log(){
        System.out.println("Data fetch logged");
    }
    //Abstract class'larda class ozelliklerini tasirlar. farkli olarak abstract class'lardan instance alinamaz.
    // Ve metotlari ve ozellikleri eger 'final' keywordu ile isaretlenmemisse (final: o metotun veya ozelligin
    // degistirilemeyecegini belirtir.) implement edilmek zorundadır.
}
