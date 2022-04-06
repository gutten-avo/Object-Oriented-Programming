import java.util.Scanner;

public class Lab3{
    Scanner sc = new Scanner(System.in);
    int total_tree;
    int height_tree;
    int n, h, i, j, k;
    
    public Lab3() {

        //set total of tree
        System.out.print("=======\nInput total of tree: ");
        n = sc.nextInt();
        //set height of tree
        System.out.print("=======\nInput height of tree: ");
        h = sc.nextInt();

        for(int k = 0; k < n; k++) {

            //buat segitiga
            for (int i = 1; i <= h; i++) {
                for (int a = 0; a < n; a++){}
                 //print space
                for (int space = 1; space<=h-i; space++) {
                    System.out.print(" ");
                }
                 //print x
                for (int x = 1; x<=i*2-1; x++){
                    System.out.print("x");
                }
                System.out.println();
        }
        

            //buat batang
            for (int space = 0; space <= h - 2; space++) {
                for (i = 0; i < h - 1; i++) {
                    System.out.print(" ");
                }
              System.out.println("x");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
    new Lab3();
    }
}