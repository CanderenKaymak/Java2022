package day1;

public class MiniProject4FriendNumbers {
    public static void main(String[] args) {
        // 220 and 284 are smallest friend numbers

        int num1 = 220;
        int num2 = 284;

        int dividingTotal1 = 0;
        int dividingTotal2 = 0;

        for (int i = 1; i < num1; i++){
            if (num1 % i == 0){
                dividingTotal1 += i;
            }
        }

        for (int i = 1; i < num2; i++){
            if (num2 % i == 0){
                dividingTotal2 += i;
            }
        }

        if (num1 == dividingTotal2 && num2 == dividingTotal1){
            System.out.println("These numbers are Friends.");
        }
        else{
            System.out.println("These numbers are NOT Friends.");
        }
    }
}
