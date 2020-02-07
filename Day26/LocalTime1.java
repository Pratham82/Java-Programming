package Day26;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;

public class LocalTime1 {
    public static void main(String[] args) {
        //now (This will prints out current systems time)
        LocalTime ld1 = LocalTime.now();
        System.out.println(ld1);


        //LocalDate Zone wise
        LocalTime ld3 = LocalTime.now(ZoneId.of("Asia/Kolkata"));
        System.out.println(ld3);
        LocalTime ld4 = LocalTime.now(ZoneId.of("America/New_York"));
        System.out.println(ld3);

        //OfHourMinute
        LocalTime ld5 = LocalTime.of(12,51);
        System.out.println(ld5);

        //OFSecondOfDay (counts the entered seconds)
        LocalTime ld6 = LocalTime.ofSecondOfDay(545);
        System.out.println(ld6);

    }
}
