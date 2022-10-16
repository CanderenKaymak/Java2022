package day1;

public class RecapDemoOne {
    public static void main(String[] args) {
        int biggest ,num1, num2, num3;

        num1 = 20;
        num2 = 25;
        num3 = 2;
        biggest = num1;

        if (biggest < num2){
            biggest = num2;
        }

        if (biggest < num3){
            biggest = num3;
        }

        System.out.println("En buyuk sayi:" + biggest);
    }
}
