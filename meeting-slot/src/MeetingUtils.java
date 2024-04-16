import javax.crypto.spec.PSource;
import java.util.List;

public class MeetingUtils {
    public static void addMeeting(Meeting desiredMeeting, List<Meeting> meetingList) {
        int count = 0;
        if (meetingList.isEmpty()) {
            meetingList.add(desiredMeeting);
            return;
        }
        for (Meeting meeting : meetingList) {
            System.out.println("in compare");
            if (meeting.getEndTime().isBefore(desiredMeeting.getStartTime())) {
                count++;
            }
        }
        if (count == 1) {
            meetingList.add(desiredMeeting);
        }
        else System.out.println("meeting is classing");
    }
    public static void printAll(List<Meeting> meetingList) {
        meetingList.forEach(System.out::println);
    }
}
