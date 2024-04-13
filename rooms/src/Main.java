import com.rooms.Room;
import com.utils.RoomUtils;

import java.awt.*;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    static RoomUtils roomService;

    public static void main(String[] args) {
        Room pune = new Room("Pune", "Suite", 6, 1200.0);
        Room mumbai = new Room("Mumbai", "Suite", 6, 2550.0);
        Room bengaluru = new Room("Bengaluru", "Suite", 6, 3050.0);
        bengaluru.setPetFriendly(true);
        pune.setPetFriendly(true);
        System.out.println("Hello world!");

        roomService = new RoomUtils();
        roomService.setRoomList(List.of(new Room[]{pune, mumbai, bengaluru}));
        roomService.printRoomList();
        System.out.println("===========------printing pet friendly rooms-------===============");
        roomService.getRoomList()
                .stream()
                .filter(Room::isPetFriendly)
                .forEach(room -> System.out.println(" " + room.getName()));
        System.out.println("===============------ average of all rooms --------------===============");
//        final int[] sum = {0};
//        OptionalDouble avarage = roomService.getRoomList().stream().mapToDouble().average();
//        if (avarage.isPresent()) {
//            System.out.print("average value is ");
//           avarage.stream().forEach(System.out::println);
//            System.out.println(" sum of all room is "+roomService.getRoomList().stream().mapToDouble(Room::getRate).sum());
//        }else System.out.println("no such room is present");
//        Map<String,String> students = new TreeMap<>();
//        students.put("pune", "rajkumar");
//        students.put("mumbai","laxmi");
//        students.keySet().forEach(System.out::println);
//        roomService.getRoomList().sort(Room.comparator);

    }


}
