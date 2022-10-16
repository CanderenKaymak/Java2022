package day1;

public class RecapDemoTwo {
    public static void main(String[] args) {
        double[] myList = {1.2, 1.3, 4.3, 4.6};
        double total = 0;
        double biggest = myList[0];

        for (double dNumber : myList) {
            if (biggest < dNumber) biggest = dNumber;
            total += dNumber;
            System.out.println(dNumber);
        }
        System.out.println("Toplam = " + total);
        System.out.println("En buyuk sayi: " + biggest);

    }
}