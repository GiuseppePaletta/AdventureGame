public class Player {

    private int health;
    private int gold;
    private String name;

    public void setHealth(int health) {
        this.health = health;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public int getHealth() {
        return health;
    }

    public Player() {
        this.health=100;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}