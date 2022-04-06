// 2440007806 - Fauzan Mustofa

import java.util.Scanner;
import java.util.Random;

public class Lab2{
    Scanner sc = new Scanner(System.in);
    int choose = 0;
    int gasoline = 100;
    int speed;

    Random rand = new Random();

    public Lab2() {
    do{
        System.out.println("=======\n1. Start Driving \n2. Rest \n3. Exit");
        System.out.println("=======\nChoose: ");
        choose = sc.nextInt();

        switch (choose) {
			case 1:
                start_driving();
				break;
			case 2:
                rest();
				break;
			case 3:
				exit();
				break;
			}

    } while(choose !=3);
    }

    public void start_driving() {
    if (gasoline == 0){
        System.out.println("=======\nYour gasoline is not enough to run your car...");
    }
    else{ 
        speed = rand.nextInt(100);
        System.out.println("=======\nYour speed: " + speed + "km/h");
        if (speed < 50){
            gasoline = gasoline - 20;
            System.out.println("=======\n20 liters used");
         }
         else{ 
            gasoline = gasoline - 40;
            System.out.println("=======\n40 liters used");
         }
     }

    }

    public void rest(){
    if(gasoline == 100){
        System.out.println("=======\nYour gasoline is full...");
    }
    else{
        gasoline = gasoline + 20;
        System.out.println("=======\n20 liters recharge");
    }

    }

    public void exit(){
    System.out.println("=======\nProgram end. Thank you.");
    System.exit(0);
    }

    public static void main(String[] args) {
    new Lab2();
    }
}


