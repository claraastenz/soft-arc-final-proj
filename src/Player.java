// Singleton Pattern
// Represents the player in the game
public class Player {
    private static Player instance;
    private String name;

    private Player(String name) {
        this.name = name;
    }

    public static Player getInstance(String name) {
        if (instance == null) {
            instance = new Player(name);
        }
        return instance;
    }

    public String getName() {
        return name;
    }
}