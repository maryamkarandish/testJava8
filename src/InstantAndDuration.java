import java.time.Duration;
import java.time.Instant;

/**
 * Created by m.karandish on 1/5/2019.
 */
public class InstantAndDuration {
    public static void main(String[] args) throws InterruptedException {
        Instant start = Instant.now();
        System.out.println(start);

        Thread.sleep(1000);

        Instant end = Instant.now();
        System.out.println(end);

        Duration elapsed = Duration.between(start,end);
        System.out.println("Elapsed : " + elapsed.toMillis() + " MilliSec");
    }
}
