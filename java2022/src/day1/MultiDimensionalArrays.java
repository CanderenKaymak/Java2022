package day1;

public class MultiDimensionalArrays {
    public static void main(String[] args) {
        String cities[][] = new String[3][3];

        cities[0][0] = "Istanbul";
        cities[0][1] = "Bursa";
        cities[0][2] = "Adapazari";
        cities[1][0] = "Izmir";
        cities[1][1] = "Antalya";
        cities[1][2] = "Gaziantep";
        cities[2][0] = "Diyarbakir";
        cities[2][1] = "Erzurum";
        cities[2][2] = "Artvin";

        for (int i = 0; i <= 2; i++){
            for (int j = 0; j <= 2; j++){
                System.out.println(cities[i][j]);
            }
            System.out.println("----------------------");
        }
    }
}
