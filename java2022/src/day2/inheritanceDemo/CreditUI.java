package day2.inheritanceDemo;

public class CreditUI {
    /*
    public void creditCalculateForCar(CarCreditManager carCreditManager){
        carCreditManager.calculate();
    }

    public void creditCalculateForHome(MortgageCreditManager mortgageCreditManager){
        mortgageCreditManager.calculate();
    }

     Burada her bir kredi turu icin kredi hesaplaması yapmaktansa, bu kredi turleri BaseCreditManager'dan
    turedikleri icin, yani BaseCreditManager'in child siniflari oluklari icin; burada sadece turetildikleri sinifi
    vererek butun kredi turleri icin ve sonradan eklenecek kredi turleri icin hesaplama islemi saglanabilir.
    REFERANS TURLERININ ONEMI
    */

    public void creditCalculateBase(BaseCreditManager baseCreditManager){
        baseCreditManager.calculate();
    }
}
