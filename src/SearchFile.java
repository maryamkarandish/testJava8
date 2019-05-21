import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * Created by m.karandish on 1/8/2019.
 */
public class SearchFile {
    public static void main(String[] args) {
        Path path = FileSystems.getDefault().getPath("files","test.txt");
        String searchTerm = "properties";
        try (Stream<String> lines = Files.lines(path)) {
            Optional<String> line = lines.filter(l -> l.contains(searchTerm)).findFirst();
            if (line.isPresent()) {
                System.out.println("Found: "+line.get());
            } else {
                System.out.println("Not Found");
            }
        } catch (Exception e) {
            System.out.println("There is an Error Occurred");
            e.printStackTrace();
        }

    }
}
