import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class TestGame {
    @Test
    public void testRoomDescription() {
        Room room = new Room("Test room");
        assertEquals("Test room", room.getDescription());
    }

    @Test
    public void testPlayerName() {
        Player player = Player.getInstance("TestPlayer");
        assertEquals("TestPlayer", player.getName());
    }

    @Test
    public void testMovementStrategy() {
        MovementStrategy strategy = new WalkStrategy();
        // You might want to test the behavior of the strategy here
        // For simplicity, we'll just check if the move() method doesn't throw an exception
        strategy.move();
    }
}
