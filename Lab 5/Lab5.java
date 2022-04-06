import java.util.*;

public class Lab5{

    Scanner sc = new Scanner(System.in);
    int choose = 0;
    int N = 0;

    static int fibonacci_method(int N) {
        int[] fib = new int[N + 2];
        int i;
        fib[1] = 1;
        for (i = 2; i <= N; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        return fib[N];
    }

	public Lab5() {

        do{
            System.out.println("\n\nFibonacci Number Calculation\n============================\n");
            System.out.println("1. Fibonacci \n2. Fibonacci with step \n3. Exit");
            System.out.printf("=======\nChoose: ");
            choose = sc.nextInt();

            switch (choose) {
			    case 1:
                    do {
                        System.out.printf("Input the number[1 - 20]: ");
                        N = sc.nextInt();
                    }while (N < 1 | N > 20);
                    System.out.println("\nThe Result of Fibonacci\n fibonacci("+N+") = "+fibonacci_method(N));
				    break;
			    case 2:
                do {
                    System.out.printf("Input the number[1 - 20]: ");
                    N = sc.nextInt();
                }while (N < 1 | N > 20);
                System.out.println("\nThe Result of Fibonacci\n");
                System.out.printf("   fibonacci("+N+") = ");
                for (int i = 0;i<N;i++){
                    if(i == N-1){
                        System.out.println("fibonacci("+i+")");
                    }
                    else{
                        System.out.printf("fibonacci("+i+") + ");
                    }
                }
                System.out.printf("   fibonacci("+N+") = ");
                for(int j=0;j<N;j++){
                    if(j == N-1){
                        System.out.println("    "+fibonacci_method(j)+"    ");
                    }
                    else{
                        System.out.printf("    "+fibonacci_method(j)+"    +");
                    }
                }
                System.out.print("   fibonacci("+N+") = "+ fibonacci_method(N));
                System.out.println();
                System.out.printf("\nThe Series of Fibonacci 3: ");
                for (int k=0;k<N+1;k++){
                    System.out.printf(fibonacci_method(k) + " ");
                }
				    break;
			    case 3:
				    exit();
				    break;
			    }

        } while(choose !=3);
    }

    public void exit(){
        System.out.println("=======\nThank you and have a nice day.. ^^\n");
        System.exit(0);
        }


	public static void main(String[] args) {
        new Lab5();
    }
}


