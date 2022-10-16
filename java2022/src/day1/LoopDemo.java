package day1;

public class LoopDemo {
    public static void main(String[] args) {
        //for loop

        for ( int i = 1; i<=10; i++){
            System.out.println(i);
        }
        System.out.println("Loop is done..!");

        //even numbers in between 0-10
        for (int i = 0; i <= 10; i +=2){
            System.out.println(i);
        }
        System.out.println("Even numbers loop is done.");

        //while loop
        int i = 1;

        while (i < 10){
            System.out.println(i);
            i++;
        }
        System.out.println("While loop is done..");

        //odd numbers in between 1-10
        int j = 1;

        while(j < 10){
            System.out.println(j);
            j+=2;

        }
        System.out.println("Odd numbers loop is done..");

        //do-while loop
        do {
            System.out.println(j);
            j+=3;
        }
        while (j < 20);
        System.out.println("Do-While loop is done .. ");
    }
}
