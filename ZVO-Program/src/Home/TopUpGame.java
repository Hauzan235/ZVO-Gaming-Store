package Home;

public class TopUpGame extends ZvoGamingStore{

    //Inheritance
    private String game1;
    private String game2;
    private String game3;
    private String game4;
    private String game5;


    public TopUpGame(){
        System.out.println("---Top Up Game---");
    }

    public void game1(String x){
        game1 = x;
    }

    public void game2(String x){ game2 = x; }

    public void game3(String x){ game3 = x; }

    public void game4(String x){ game4 = x; }

    public void game5(String x){ game5 = x; }


    public String getGame1(){
        return game1;
    }

    public String getGame2(){
        return game2;
    }

    public String getGame3(){
        return game3;
    }

    public String getGame4(){
        return game4;
    }

    public String getGame5(){
        return game5;
    }
}

