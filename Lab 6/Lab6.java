import java.util.*;

public class Lab6 {
    public static Scanner sc = new Scanner(System.in);
    
    public static void answer(int user_answer, int random_times_num_1, int random_times_num_2) {
        int result = random_times_num_1 * random_times_num_2;
        if(result != user_answer){
            System.out.println("\nYou Are Wrong");
        }
        else if(result == user_answer){
            System.out.println("\nYou Are Brilliant");
        }
    }

    private static void header()
    {
        System.out.println(" _____________ ");
        System.out.println("|   _     _   |");
        System.out.println("|  |_|   |_|  |");
        System.out.println("|             |");
        System.out.println("|             |");
        System.out.println("|   |_____|   |");
        System.out.println("|_____________| \n");
    }

    private static void level1() {
        Random rand = new Random();
        int rand1_int = rand.nextInt(4);
        int rand2_int = rand.nextInt(4);
        int rand3_int = rand.nextInt(4);
        int rand4_int = rand.nextInt(4);
        int random_times_num_1 = 0, random_times_num_2 = 0;
        System.out.println("\n\nGuess Multiplication Random Matrix");
        System.out.println("\n");

        Random r = new Random();
        int[][] mat = new int[5][5];
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                mat[i][j] = r.nextInt (9) + (1);

                if(mat[i][j] < 10){
                    System.out.print("["+i+"]["+j+"]"+mat[i][j]+"\t\t");
                }
                else {
                    System.out.print("["+i+"]["+j+"]"+mat[i][j]+"\t");
                }
            }
            System.out.println();
            random_times_num_1 = mat[rand1_int][rand2_int];
            random_times_num_2 = mat[rand3_int][rand4_int];
        }
        System.out.print("What is the result of number["+rand1_int+"]["+rand2_int+"] times number ["+rand3_int+"]["+rand4_int+"]?");
        int user_answer = sc.nextInt();
        answer(user_answer, random_times_num_1, random_times_num_2);
    }

    private static void level2() {
        Random rand = new Random();
        int rand1_int = rand.nextInt(4);
        int rand2_int = rand.nextInt(4);
        int rand3_int = rand.nextInt(4);
        int rand4_int = rand.nextInt(4);
        int random_times_num_1 = 0, random_times_num_2 = 0;
        System.out.println("\n\nGuess Multiplication Random Matrix");
        System.out.println("\n");

        Random r = new Random();
        int[][] mat = new int[5][5];
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                mat[i][j] = r.nextInt (90) + (10);

                if(mat[i][j] < 10){
                    System.out.print("["+i+"]["+j+"]"+mat[i][j]+"\t\t");
                }
                else {
                    System.out.print("["+i+"]["+j+"]"+mat[i][j]+"\t");
                }
            }
            System.out.println();
            random_times_num_1 = mat[rand1_int][rand2_int];
            random_times_num_2 = mat[rand3_int][rand4_int];
        }
        System.out.print("What is the result of number["+rand1_int+"]["+rand2_int+"] times number ["+rand3_int+"]["+rand4_int+"]?");
        int user_answer = sc.nextInt();
        answer(user_answer, random_times_num_1, random_times_num_2);
    }

    private static void level3() {
        Random rand = new Random();
        int rand1_int = rand.nextInt(4);
        int rand2_int = rand.nextInt(4);
        int rand3_int = rand.nextInt(4);
        int rand4_int = rand.nextInt(4);
        int random_times_num_1 = 0, random_times_num_2 = 0;
        System.out.println("\n\nGuess Multiplication Random Matrix");
        System.out.println("\n");

        Random r = new Random();
        int[][] mat = new int[5][5];
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                mat[i][j] = r.nextInt (100) + (100);

                if(mat[i][j] < 10){
                    System.out.print("["+i+"]["+j+"]"+mat[i][j]+"\t\t");
                }
                else {
                    System.out.print("["+i+"]["+j+"]"+mat[i][j]+"\t");
                }
            }
            System.out.println();
            random_times_num_1 = mat[rand1_int][rand2_int];
            random_times_num_2 = mat[rand3_int][rand4_int];
        }
        System.out.print("What is the result of number["+rand1_int+"]["+rand2_int+"] times number ["+rand3_int+"]["+rand4_int+"]?");
        int user_answer = sc.nextInt();
        answer(user_answer, random_times_num_1, random_times_num_2);
    }

	public static void main(String[] args) {
        header();
        int choice;
        do{
            System.out.println("+======================+");
            System.out.println("+Options               +");
            System.out.println("+======================+");
            System.out.println("+1. Level 1            +");
            System.out.println("+2. Level 2            +");
            System.out.println("+3. Level 3            +");
            System.out.println("+4. Exit               +");
            System.out.println("+======================+");
            System.out.print("Choice >> ");
            choice = sc.nextInt();

            switch(choice){
                case 1:
                    level1();
                    break;
                case 2:
                    level2();
                    break;
                case 3: 
                    level3();
                    break;
                case 4:
                    System.out.println("\nThank You For Playing");
                    break;
            }
            }
            while(choice != 4);
    }
}
