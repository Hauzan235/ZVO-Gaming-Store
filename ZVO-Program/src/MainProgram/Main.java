package MainProgram;

import Home.GamePopuler;
import Home.TopUpGame;
import Home.ZvoGamingStore;
import Register_Transaksi.LoginRegister;
import Register_Transaksi.Transaksi;

import java.util.Scanner;

public class Main {

    public static String input;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("           $ SELAMAT DATANG Di ZVO GAMING STORE $");
        System.out.println("Cara tercepat dan termudah untuk pembelian kredit permainan.");
        System.out.println();
        System.out.println("Silahkan Login atau Register Dahulu");
        System.out.print("1. login      ");
        System.out.println("2. register");
        input = in.nextLine();
        System.out.println();

        //Loop
        while (input.equals("login")) {


            System.out.print("Username        : ");
            String Luser = in.nextLine();
            System.out.print("Password        : ");
            String Lpassword = in.nextLine();
            input = in.nextLine();

            ZvoGamingStore game = new ZvoGamingStore();
            GamePopuler st = new GamePopuler();
            st.Game1("PUBG");
            st.Game2("Mobile Legends");
            st.Game3("Genshin Impact");


            game.game1();
            System.out.println(st.getGame1());
            game.game2();
            System.out.println(st.getGame2());
            game.game3();
            System.out.println(st.getGame3());

            System.out.println();
            TopUpGame i = new TopUpGame();
            i.game1("PUBG");
            i.game2("Call of Duty Mobile");
            i.game3("Free Fire");
            i.game4("Mobile Legends");
            i.game5("Genshin Impact");


            game.game1();
            System.out.println(i.getGame1());
            game.game2();
            System.out.println(i.getGame2());
            game.game3();
            System.out.println(i.getGame3());
            game.game4();
            System.out.println(i.getGame4());
            game.game5();
            System.out.println(i.getGame5());

            Transaksi objek2 = new Transaksi();
            objek2.show();


        }
        while (input.equals("register")) {

            System.out.print("Username        : ");
            String Username = in.nextLine();
            System.out.print("Email           : ");
            String Email = in.nextLine();
            System.out.print("Password        : ");
            String Password = in.nextLine();
            LoginRegister count = new LoginRegister(Email,Username, Password);
            System.out.println(" ");
            input = in.nextLine();

            ZvoGamingStore game = new ZvoGamingStore();
            GamePopuler st = new GamePopuler();
            st.Game1("PUBG");
            st.Game2("Mobile Legends");
            st.Game3("Genshin Impact");


            game.game1();
            System.out.println(st.getGame1());
            game.game2();
            System.out.println(st.getGame2());
            game.game3();
            System.out.println(st.getGame3());

            System.out.println();
            TopUpGame i = new TopUpGame();
            i.game1("PUBG");
            i.game2("Call of Duty Mobile");
            i.game3("Free Fire");
            i.game4("Mobile Legends");
            i.game5("Genshin Impact");


            game.game1();
            System.out.println(i.getGame1());
            game.game2();
            System.out.println(i.getGame2());
            game.game3();
            System.out.println(i.getGame3());
            game.game4();
            System.out.println(i.getGame4());
            game.game5();
            System.out.println(i.getGame5());

            Transaksi objek2 = new Transaksi();
            objek2.show();
        }
    }

}
