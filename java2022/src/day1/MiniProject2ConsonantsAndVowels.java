package day1;

public class MiniProject2ConsonantsAndVowels {
    public static void main(String[] args) {
        char letter = 'b';

        char[] vowels = {'a','e','i','o','u'};
        boolean isVowel = false;
        for (char lttr : vowels) {
            if (letter == lttr) isVowel = true;
        }
        if (isVowel){
            System.out.println("the Letter is a Vowel.");
        }
        else{
            System.out.println("the letter is a Consonant.");
        }

        System.out.println("----------------------------------------------");
        // switch case
        switch (letter){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("The letter is a Vowel.");
                break;
            default:
                System.out.println("The letter is a Consonant.");
        }
    }
}
