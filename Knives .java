package example;


import java.util.Scanner;

public class Testify {
    public static void main(String[] args) {
         knives();
    }

    public static void knives() {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        Utillllf.menu();
        int a = sc.nextInt();
        if (a == 1) {
            Utillllf.custocl();
        }else {
            Utillllf.erorr();
        }
        int b = sc.nextInt();
        if (b == 2) {
           Utillllf.colors();
        }else{
            Utillllf.erorr();
        }
        int c = sc.nextInt();
        if (c == 1) {
            count += 15;
        } else if (c == 2) {
            count += 10;
        } else if (c == 3) {
            count += 5;
        } else {
            Utillllf.erorr();
        }
        if (c == 1 || c == 2 || c == 3) {

           Utillllf.metal();
        }
        int d = sc.nextInt();
        if (d == 1) {
            count += 5;
        } else if (d == 2) {
            count += 3;
        } else if (d == 3) {
            count += 7;
        } else if (d == 4) {
            count += 50;
        } else {
            Utillllf.erorr();
        }
        System.out.println("Total Price:" + " " + count+"AZN");
        Utillllf.cc();
        Scanner scanner = new Scanner(System.in);
        String cc = scanner.next();
        if (cc.equals("75441028918281")){
            System.out.println("Checking");
            System.out.println("Succssefuly ");
        }else{
            System.out.println("Checking");
            System.out.println("Unsuccsessfully");
        }
        Utillllf.doublesout();
        int ff = sc.nextInt();

       if (ff==1){
         knives();
        }else if (ff==0){
           System.out.println("See You");
       }

    }
}
