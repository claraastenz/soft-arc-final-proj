import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;
public class CastleRoom implements RoomFactory {
    @Override
    public Room createRoom() {
        // Create rooms
        Room mainHall = new Room("The Entrance Hall");
        Room northRoom = new Room("The Crystal Chamber");
        Room southRoom = new Room("The Great Library");
        Room eastRoom = new Room("The Throne Room");
        Room westRoom = new Room("The Chamber of Life");

        // Create assets for each room
        Asset mainHallAsset = new Asset("Sword");
        Asset northRoomAsset = new Asset("Crystal");
        Asset southRoomAsset = new Asset("Book");
        Asset eastRoomAsset = new Asset("Crown");
        Asset westRoomAsset = new Asset("Potion");

        // Set assets for each room
        mainHall.setAsset(mainHallAsset);
        northRoom.setAsset(northRoomAsset);
        southRoom.setAsset(southRoomAsset);
        eastRoom.setAsset(eastRoomAsset);
        westRoom.setAsset(westRoomAsset);

        // Set adjacent rooms for the main hall
        mainHall.setAdjacentRoom("north", northRoom);
        mainHall.setAdjacentRoom("south", southRoom);
        mainHall.setAdjacentRoom("east", eastRoom);
        mainHall.setAdjacentRoom("west", westRoom);

        // Set adjacent rooms for the north room
        northRoom.setAdjacentRoom("south", mainHall);

        // Set adjacent rooms for the south room
        southRoom.setAdjacentRoom("north", mainHall);

        // Set adjacent rooms for the east room
        eastRoom.setAdjacentRoom("west", mainHall);

        // Set adjacent rooms for the west room
        westRoom.setAdjacentRoom("east", mainHall);

        // Return the main hall as the starting point
        return mainHall;
    }
}

