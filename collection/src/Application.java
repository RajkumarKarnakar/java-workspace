import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;


public class Application {
    public static void main(String[] args) {
        Room pune = new Room("Pune", "Suite", 6, 250.0);
        Room mumbai = new Room("Mumbai", "Suite", 6, 250.0);
        Room bengaluru = new Room("Bengaluru", "Suite", 6, 250.0);

        Collection<Room> rooms = new ArrayList<>();
        rooms.add(pune);
        rooms.add(mumbai);
        rooms.add(bengaluru);
        bengaluru.setPetFriendly(true);
        pune.setPetFriendly(true);

        rooms.stream().filter(Room::isPetFriendly).forEach(room ->
                System.out.println(room.name));


    }
}
