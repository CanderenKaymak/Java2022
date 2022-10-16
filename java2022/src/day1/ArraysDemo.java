package day1;

public class ArraysDemo {
    public static void main(String[] args) {
        /*
        String student1 = "Canderen";
        String student2 = "Mert";
        String student3 = "Atit";

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        */
        //with array
        String[] students = new String[4];
        students[0] = "Canderen";
        students[1] = "Mert";
        students[2] = "Atit";
        students[3] = "Cuneyt";

        for (int i = 0; i < students.length; i++){
            System.out.println(students[i]);
        }
        // with foreach
        for(String st : students) System.out.println(st);
    }
}
