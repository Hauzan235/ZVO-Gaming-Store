package Home;


public class GamePopuler extends ZvoGamingStore{
    private String game1;
    private String game2;
    private String game3;

    public GamePopuler(){
        System.out.println(" ");
        System.out.println("                    $ ZVO GAMING STORE $");
        System.out.println("Cara tercepat dan termudah untuk pembelian kredit permainan.");
        System.out.println();
        System.out.println("      MENU");
        System.out.println();
        System.out.println(" ~Top up and Voucher~ ");
        System.out.println();
        System.out.println("---Game Populer---");
    }

    public void Game1(String x){
        game1 = x;
    }

    public void Game2(String x){
        game2 = x;
    }

    public void Game3(String x){
        game3 = x;
    }

    public String getGame1(){
        return game1;
    }

    public String getGame2(){
        return game2;
    }

    public String getGame3(){
        return game3;
    }

}
