package day2.inheritanceDemo;

public class Main {
    public static void main(String[] args) {
        /* CarCreditManager carCreditManager = new CarCreditManager();
        carCreditManager.calculate();

        MortgageCreditManager mortgageCreditManager = new MortgageCreditManager();
        mortgageCreditManager.calculate();
        */

        CreditUI creditUI = new CreditUI();
        creditUI.creditCalculateBase(new CarCreditManager());
        creditUI.creditCalculateBase(new MortgageCreditManager());

        /* Burada surdurulebilirlik saglanmis olur. yeni  bir ozellik eklendiginde, degisim oldugunda Ornegin; ihtiyac
        kredisi eklendiginde sadece bu siniftan turemis olmasi yeterli olacaktir. ve diger calisan hicbir seye etkisi
         olmayacaktir. Bu aslinda tam anlamiyla poliformizm(cok bicimlilik).*/
    }
}
