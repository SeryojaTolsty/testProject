package NewPackage;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //leapYear();
        consoleInput();
    }

    /*private static void leapYear() {
        int a = 2080;
        if (a % 4 != 0) {
            if (a % 100 != 0) {
                if (a % 400 != 0){
                    System.out.println("Год не високосный");
                }
            }
        } else {
            System.out.println("Год високосный");
        }
    }*/

    private static void consoleInput() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите год: ");
        int a = in.nextInt();
        if (a % 4 != 0) {
            if (a % 100 != 0) {
                if (a % 400 != 0){
                    System.out.println("Год не високосный");
                }
            }
        } else {
            System.out.println("Год високосный");
        }
    }




}
