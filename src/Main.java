import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creating a player
        System.out.println("Enter player name:");
        String playerName = scanner.nextLine();
        Player player = Player.getInstance(playerName);

        // Creating the castle
        RoomFactory factory = new CastleRoom();
        Room currentRoom = factory.createRoom();
        System.out.println("Welcome, " + player.getName() + "! You are in " + currentRoom.getDescription());

        // Display asset in the current room
        Asset currentAsset = currentRoom.getAsset();
        if (currentAsset != null) {
            System.out.println("You see a " + currentAsset.getName() + " in the room.");
        }

        while (true) {
            System.out.println("Choose an action:");
            System.out.println("1. Move to another room");
            System.out.println("2. Quit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    System.out.println("You decide to move. Which direction? (north, south, east, west)");
                    String direction = scanner.nextLine();
                    Room nextRoom = currentRoom.getAdjacentRoom(direction.toLowerCase());
                    if (nextRoom != null) {
                        currentRoom = nextRoom;
                        System.out.println("You move " + direction + ". Now you are in " + currentRoom.getDescription());

                        // Display asset in the new room
                        Asset newAsset = currentRoom.getAsset();
                        if (newAsset != null) {
                            System.out.println("You see a " + newAsset.getName() + " in the room.");
                        }
                    } else {
                        System.out.println("You can't move in that direction.");
                    }
                    break;
                case 2:
                    System.out.println("Goodbye, " + player.getName() + "!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please choose again.");
            }
        }
    }
}
