package day1;

public class MiniProject1PrimeNumber {
    public static void main(String[] args) {
        int number = 10;
        boolean isPrime = true;

        if (number == 1){
            System.out.println("The Number is NOT a Prime Number");
            return;
        }
        else if (number < 1){
            System.out.println("Invalid Number");
            return;
        }
        else{
            for (int i = 2; i < number; i++){
                if (number % i == 0){
                    isPrime = false;
                }
            }
        }

        if (isPrime){
            System.out.println("The Number is a Prime Number.");
        }
        else{
            System.out.println("The Number is NOT a Prime Number.");
        }

    }
}
