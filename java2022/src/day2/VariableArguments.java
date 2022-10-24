package day2;

public class VariableArguments {
    public static void main(String[] args) {
        System.out.println(add(1,2,3,4));
    }

    public static int add(int... numbers){
        /*
         buradaki '...' istedigimiz kadar deger almamizi saglar. Ve aslinda burada bize Java kendisi bir array
         tanimlar arkada. NOT: burada onemli bir nokta ilkel veri tiplerinde sorun olmasa da bir nesne icin
         Variable Argument kullanildiginda bu dizaynin test edilebilirligi sorgulanabilir. Bu yuzden bunun yerine
         koleksiyonlar veya nesnel yapilar tercih edilebilir.
        */
        int total = 0;
        for(int num:numbers){
            total += num;
        }
        return total;
    }
}
