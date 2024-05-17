// Concrete implementation of MovementStrategy
public class WalkStrategy implements MovementStrategy {
    @Override
    public void move() {
        System.out.println("Walking...");
    }
}