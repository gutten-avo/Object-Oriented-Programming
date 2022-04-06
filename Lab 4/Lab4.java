import java.util.*;

public class Lab4{

    Scanner sc = new Scanner(System.in);
    String input, remainingLetters, firstLetter;
    int length, config, vowel_count = 0, consonant_count = 0;

    
    public Lab4() {
        System.out.println("Welcome to text game 4.0\n========================\n");
        System.out.print("Input your data [5 - 30 characters]: ");
        
        do {
            input = sc.nextLine();
            length = input.length();
        }while (length < 5 || length > 30);
        
        for(int i = 0;i < length; i++){
            char vowel = input.charAt(i);
            if(vowel == 'a'|| vowel == 'i'|| vowel == 'u' || vowel == 'e' || vowel == 'o') {
                vowel_count++;
            }
            else {
                consonant_count++;
            }
            
        }System.out.println("Please assign text formating");

        do {
            System.out.print("Input configuration [2 - 18]: ");
            config = sc.nextInt();
        }while (config < 2 || config > 18);
        System.out.println();


        // for (int j = 0; j < length; j++) {
        //     System.out.print(input.charAt(j) + " ");
        //     if(j == config - 1){
                
        //         // String firstLetter = input.substring(0, 1);
        //         // String remainingLetters = input.substring(1, input.length());

        //         // firstLetter = firstLetter.toUpperCase();

        //         System.out.println();
        //     }
        // }

        int temp, capital = 1;
        temp = config;
        for (int j = 0; j < length; j++) {
            if(j == capital - 1){
                capital = config + 1;
                System.out.print(input.toUpperCase().charAt(j) + " "); //huruf array
            }
            else
                System.out.print(input.charAt(j) + " ");
            

            if(j == config - 1){
                System.out.println();
                config = config + temp;
            }
        }

        System.out.println("\n\nWord summary:\n=============\nVowel: " +vowel_count+ "\nConsonant: " +consonant_count);

    }//public Lab4

    public static void main(String[] args) {
    new Lab4();
    }

}//public class Lab4