package RPG;

public class RPGMain {

    public static void main(String[] arg) {
       Monster troll = new Troll("Öcü"
       ,9,20);
       Monster wolf = new Wolf("Wolfteam",10,40);
        System.out.println(wolf.attack());
        System.out.println(troll.attack());
    }
}
