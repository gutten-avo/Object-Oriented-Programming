/*import java.util.Scanner;

public class Menu{
    static Scanner input = new Scanner(System.in);
    static boolean ordering = true;

    public static void menus() {
        System.out.println("Welcome \n1. Order Boba \n2. Pay \n3. Exit");
    }

    public static item_price(int order_boba) {
        if (order_boba == 1) {
            System.out.println("You've ordered a Fire Chocolate Boba (@ Rp. 75000,-)");
            item_price = 75000;
        }
        if (order_boba == 2) {

            System.out.println("You've ordered a Water Green Tea Boba (@ Rp. 55000,-)");
            item_price = 55000;
        }
        return item_price;
    }

    public static void main(String[] args){
        int menu_option;
        int order, choose, cash;

        do{
            menus();
            menu_option = input.nextInt();
            switch (menu_option) {
                case 1:


            }
        }
    }

}

ini contoh penggunaan repetition do while do {
  System.out.println("Masukkan angka 1 = ");
  angka1 = baca.nextInt(); 
   System.out.println("Masukkan angka 2 = ");
  angka2 = baca.nextInt(); 
  hasil = angka1+angka2; 
  System.out.println("Hasil = " + hasil);
  } while (angka1 !=0);*/


import java.util.*;

class Yummy_Delivery_Boba{

    public static void main (String args[]){
        int choice, price, order_boba, money;
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Yummy Delivery Boba \n1. Order Boba \n2. Pay \n3. Exit");

        System.out.println("Enter choice (1-3): ");

        choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Menus :\n1. Fire Chocolate Boba (@ Rp. 75000,-) \n2. Water Green Tea Boba (@ Rp. 55000,-)\nChoose Menus: ");
                order_boba = sc.nextInt();

                if (order_boba == 1){
                    System.out.println("Input cash nominal: ");
                    money = sc.nextInt();
                    if(money >= 75000){
                        money = money - 75000;
                        System.out.println("Change is: " +money);
                    }
                    else {
                        System.out.println("Money not enough");
                    }
                }
                
                if (order_boba == 2){
                    System.out.println("Input cash nominal: ");
                    money = sc.nextInt();
                    if(money >= 55000){
                        money = money - 55000;
                        System.out.println("Change is: " +money);
                        }
                    else {
                        System.out.println("Money not enough");
                    }
                }

                else System.out.println("Wrong Input");
                break;
            
            case 2:
                System.out.println("You are not buy anything...");
                break;
            case 3:
                System.out.println("Program end");
                System.exit(0);
                
                break;
            default:
                System.out.println("Wrong choice...");
        }

}
}

