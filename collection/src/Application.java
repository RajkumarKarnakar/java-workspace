import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;


public class Application {
    Room[] rooms;
    public static void main(String[] args) {
        Room pune = new Room("Pune", "Suite", 6, 1200.0);
        Room mumbai = new Room("Mumbai", "Suite", 6, 2550.0);
        Room bengaluru = new Room("Bengaluru", "Suite", 6, 3050.0);

        Collection<Room> rooms = new ArrayList<>();
        rooms.add(pune);
        rooms.add(mumbai);
        rooms.add(bengaluru);
        bengaluru.setPetFriendly(true);
        pune.setPetFriendly(true);

        Collection<Room> petFriendlyRooms =
        rooms.stream().filter(Room::isPetFriendly).toList();
        System.out.println(petFriendlyRooms);

        System.out.println(rooms.stream().mapToDouble(Room::getRate).sum());

    }
    public void applyDiscount(final double discount){

    }
}
