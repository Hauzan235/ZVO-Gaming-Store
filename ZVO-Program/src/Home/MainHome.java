package Home;


import ZVO_Buy_Voucher.Class.Transaksi;

public class MainHome {
    public static void main(String[] args) {
        ZvoGamingStore game = new ZvoGamingStore();

        System.out.println();
        GamePopuler st = new GamePopuler();
        st.Game1("PUBG");
        st.Game2("Call Of Duty Mobile");
        st.Game3("Free Fire");


        game.game1(); System.out.println(st.getGame1());
        game.game2(); System.out.println(st.getGame2());
        game.game3(); System.out.println(st.getGame3());

        System.out.println();
        TopUpGame i = new TopUpGame();
        i.game1("Genshin Impact");
        i.game2("Valorant");
        i.game3("Mobile Legends");


        game.game1(); System.out.println(i.getGame1());
        game.game2(); System.out.println(i.getGame2());
        game.game3(); System.out.println(i.getGame3());
    }


    }

