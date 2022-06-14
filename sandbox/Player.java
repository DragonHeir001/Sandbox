package sandbox;
public class Player {
    private int health;
    private int level;
    private int damage;
    private String name;

    public Player() {
        this.health = 10;
        this.level = 1;
        this.damage = 3;
        this.name = "unnamed";
    }
    public Player(String name) {
        this.health = 10;
        this.level = 1;
        this.damage = 3;
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void levelUp() {
        this.health += 3;
        this.level += 1;
        this.damage += 3;
    }
    public void printStats() {
        System.out.println("hp: " + health);
        System.out.println("level: " + level);
        System.out.println("damage: " + damage);
        System.out.println("name: " + name);
    }
}
