import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class MeetingSchedule {
    public static void main(String[] args) {
        LocalTime time = LocalTime.of(10,15,0);
        LocalTime time2 = LocalTime.of(10,41,0);
        LocalDate date = LocalDate.of(2024,4,13);
        List<Meeting> meetings = new ArrayList<>();
        MeetingUtils.addMeeting(new Meeting(25, LocalDateTime.of(date,time)),meetings);

        MeetingUtils.addMeeting(new Meeting(25, LocalDateTime.of(date,time)),meetings);
        MeetingUtils.addMeeting(new Meeting(25, LocalDateTime.of(date,time2)),meetings);
        MeetingUtils.printAll(meetings);

    }
}
