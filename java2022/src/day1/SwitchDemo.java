package day1;

public class SwitchDemo {
    public static void main(String[] args) {
        char grade = 'v';

        switch (grade) {
            case 'A':
                System.out.println("Tebrikler, sinifi mukemmel notla gectiniz..");
                break;
            case 'B':
                System.out.println("Tebrikler, sinifi cok iyi bir sekille gectiniz..");
                break;
            case 'C':
                System.out.println("Tebrikler, sinifi iyi bir sekilde gectiniz.. ");
                break;
            case 'D':
                System.out.println("Tebrikler, sinifi gectiniz..");
                break;
            case 'F':
                System.out.println("Uzgunum sinifi tekrarlamak zorundasiniz!..");
                break;
            default:
                System.out.println("Lutfen gecerli bir not giriniz..!");
        }
    }
}
