package sandbox;
import sandbox.Player;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("start program");
        Player enemy = new Player();
        for (int i = 0; i < 100; i++) {
            enemy.levelUp();
        }
        enemy.printStats();
        Player jane = new Player("jane");
            jane.levelUp();
        jane.printStats();
        Player bobby = new Player("bobby");
            bobby.levelUp();
        bobby.printStats();
        System.out.println("end program");
    }
}
