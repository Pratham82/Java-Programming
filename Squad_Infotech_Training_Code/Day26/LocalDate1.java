package Day26;

import java.time.LocalDate;
import java.time.ZoneId;

public class LocalDate1 {
    public static void main(String[] args) {

        //now (This will prints out current systems time)
        LocalDate ld1 = LocalDate.now();
        System.out.println(ld1);

        //of method
        LocalDate ld2 = LocalDate.of(1998,5,15);
        System.out.println(ld2);

        //LocalDate Zone wise
        LocalDate ld3 = LocalDate.now(ZoneId.of("Asia/Kolkata"));
        System.out.println(ld3);
        LocalDate ld4 = LocalDate.now(ZoneId.of("America/New_York"));
        System.out.println(ld3);

        //OfYourDay (Counts days from the year entered)
        LocalDate ld5 = LocalDate.ofYearDay(2021,45);
        System.out.println(ld5);

        //OfEpochDay (Counts days from 1970 )
        LocalDate ld6 = LocalDate.ofEpochDay(400);
        System.out.println(ld6);
    }
}
