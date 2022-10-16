package day1;

public class MiniProject3PerfectNumber {
    public static void main(String[] args) {
        // 6 is a perfect number ---- 3+2+1 = 6;
        // 28 is a perfect number --- 14 + 7 + 4 + 2 + 1 = 28;

        int num = 16;
        int dividingNumTotal = 0;

        for (int i = 1; i < num; i++){
            if (num % i == 0){
                dividingNumTotal += i;
            }
        }

        if (dividingNumTotal == num){
            System.out.println("It is a Perfect Number.");
        }
        else{
            System.out.println("It is NOT a Perfect Number.");
        }
    }
}
