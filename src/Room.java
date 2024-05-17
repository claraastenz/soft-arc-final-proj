import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Room {
    private String description;
    private Map<String, Room> adjacentRooms;
    private Asset asset;

    public Room(String description) {
        this.description = description;
        adjacentRooms = new HashMap<>();
    }

    public String getDescription() {
        return description;
    }

    public void setAdjacentRoom(String direction, Room room) {
        adjacentRooms.put(direction.toLowerCase(), room);
    }

    public Room getAdjacentRoom(String direction) {
        return adjacentRooms.get(direction.toLowerCase());
    }

    public void setAsset(Asset asset) {
        this.asset = asset;
    }

    public Asset getAsset() {
        return asset;
    }
}
