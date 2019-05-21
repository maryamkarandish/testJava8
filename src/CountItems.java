import java.util.ArrayList;
import java.util.List;

/**
 * Created by m.karandish on 1/5/2019.
 */
public class CountItems {
    public static void main(String[] args) {

        System.out.println("Creating List");

        List<String> strings = new ArrayList<String>();
        for(int i=0; i< 100 ;  i++){
            strings.add("item  " + i);

        }
//        strings.stream().forEach(p-> System.out.println(p));
        long count = strings.stream().count();
        System.out.println("Count: " + count);

    }
}
