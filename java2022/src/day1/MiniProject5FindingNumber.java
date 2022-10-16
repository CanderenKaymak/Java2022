package day1;

import java.util.Arrays;

public class MiniProject5FindingNumber {
    public static void main(String[] args) {
        int[] numbers = new int[]{1,2,5,7,9,0};
        int searching = 5;

        if (!(Arrays.stream(numbers).anyMatch(value -> value == searching))) {
            System.out.println("number Not found");
        } else {
            System.out.println("number is existing.");
        }
    }
}
