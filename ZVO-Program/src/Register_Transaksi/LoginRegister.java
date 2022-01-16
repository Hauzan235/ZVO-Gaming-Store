package Register_Transaksi;

import java.util.Scanner;

public class LoginRegister {

    public static String input;
    String Luser;
    String Lpassword;

    public LoginRegister(
            String Email,
            String Username,
            String password)
    {

        Scanner in = new Scanner(System.in);
        System.out.println("Registrasi berhasil dengan Username :" + Username);
        System.out.println("                           Email    :" + Email);
        System.out.println("         ");
        System.out.println("Silahkan Login");
        System.out.print("username        : ");
        Luser = in.nextLine();
        System.out.print("Password        : ");
        Lpassword = in.nextLine();
        input = in.nextLine();
    }
}
