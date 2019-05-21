import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoField;
import java.util.Locale;

/**
 * Created by m.karandish on 1/5/2019.
 */
public class DateAndTimes {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);

        LocalDate specificDate = LocalDate.of(2000,01,01);
        System.out.println(specificDate);
        DateTimeFormatter df = DateTimeFormatter.BASIC_ISO_DATE;
        System.out.println(df.format(currentDate));

        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime);

        LocalTime specificTime = LocalTime.of(14,0,45);
        System.out.println(specificTime);

        LocalDateTime currentDT = LocalDateTime.now();
        System.out.println(currentDT);

        LocalDateTime speciticDT = LocalDateTime.of(specificDate,specificTime);
        System.out.println(speciticDT);

        DateTimeFormatter fLong = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
        System.out.println(fLong.format(currentDate));

        String pr_Long = fLong.withLocale(Locale.CHINA).format(currentDate);
        System.out.println(pr_Long);

        DateTimeFormatterBuilder b = new DateTimeFormatterBuilder()
                .appendValue(ChronoField.MONTH_OF_YEAR).appendLiteral("*")
                .appendValue(ChronoField.DAY_OF_MONTH).appendLiteral("*")
                .appendValue(ChronoField.YEAR);
        DateTimeFormatter dft = b.toFormatter();
        System.out.println(dft.format(currentDate));

//        Manage TimeZone
        System.out.println("TimeZone: ");

        DateTimeFormatter f = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        LocalDateTime l = LocalDateTime.now();
        System.out.println(f.format(l));

        ZonedDateTime gmt = ZonedDateTime.now(ZoneId.of("GMT+0"));
        System.out.println(f.format(gmt));
    }
}
