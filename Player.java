public class Player {

    private int health;
    private String name;

    public void setHealth(int health) {
        this.health = health;
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