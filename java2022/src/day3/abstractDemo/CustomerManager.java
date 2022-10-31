package day3.abstractDemo;

public class CustomerManager {
    BaseDatabaseManager databaseManager;

    public void getCustomers(){
        /*
        * Burada direkt istenilen database den verinin getirilebilmesi icin
        * OracleDBManager odbm = new OracleDBManager(); cagrilirsa Oracle sinifina dogrudan bagli kalinir. Bunu
        * istemeyiz. SOLID prensiplerinin 'o' su Open-Closed Princple : Projede olusabilecek yeni bir ozellik veya
        * istek eklemek icin yapilacak yeni gelistirmeler baska sistemlere ,kodlara mudahale etmemeli.
        * Bu yuzden dogru kullanim
        */
        databaseManager.getData();
        databaseManager.log();
    }
}
