import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by m.karandish on 1/1/2019.
 */
public class UseComparableJava {
    public static void main(String[] args){
        List<String> strings =  new ArrayList<String>();
        strings.add("AAA");
        strings.add("bbb");
        strings.add("CCC");
        strings.add("ddd");
        strings.add("EEE");
        Collections.sort(strings);
        System.out.print("Simple sort ");
        for(String string1 : strings){
            System.out.print(string1+" ");
        }

        Comparator<String> comp = (str1,str2) ->{
            return str1.compareToIgnoreCase(str2);
        };
//        anonymous class
        Collections.sort(strings, comp);
//        Collections.sort(strings, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.compareToIgnoreCase(o2);
//            }
//        });

        System.out.print("Sort with Comparator ");
        for (String string2 : strings){
            System.out.print(string2+" ");
        }
    }
}
