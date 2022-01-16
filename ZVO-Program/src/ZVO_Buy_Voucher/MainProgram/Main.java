package ZVO_Buy_Voucher.MainProgram;

import ZVO_Buy_Voucher.Class.LoginRegister;
import ZVO_Buy_Voucher.Class.home;
import java.util.Scanner;

public class Main {
    public static int count = 1;
    public static String input;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println();
        System.out.println();
        System.out.println("=====SELAMAT DATANG DI ZVO GAMING STORE=====");
        System.out.println();
        System.out.println("Silahkan Login atau Register Dahulu");
        System.out.print("1. login      ");
        System.out.println("2. register");
        input = in.nextLine();
        System.out.println();

        //Loop
        while (input.equals("login")) {

            System.out.print("username        : ");
            String Luser = in.nextLine();
            System.out.print("Password        : ");
            String Lpassword = in.nextLine();
            System.out.println("");
            input = in.nextLine();
        }
        while (input.equals("register")) {

            System.out.print("Username        : ");
            String Ruser = in.nextLine();
            System.out.print("Email           : ");
            String Email = in.nextLine();
            System.out.print("Password        : ");
            String Rpassword = in.nextLine();
            LoginRegister count = new LoginRegister(Email, Ruser, Rpassword);
            System.out.println(" ");
            input = in.nextLine();

            home objek1 = new home();
            objek1.show();


        }

    }

}
