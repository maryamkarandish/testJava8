import java.util.*;

/**
 * Created by m.karandish on 1/2/2019.
 */
public class TraverseLists {
    public static void main(String[] args){

        List<String> strings =  new ArrayList<String>();
        strings.add("AAA");
        strings.add("bbb");
        strings.add("CCC");
        strings.add("ddd");
        strings.add("EEE");
        Collections.sort(strings);
        System.out.print("Simple sort ");
//        Traverse with for each
//        for(String string1 : strings){
//            System.out.print(string1+" ");
//        }
        strings.forEach(str -> System.out.print(str));

        Comparator<String> comp = (str1, str2) ->{
            return str1.compareToIgnoreCase(str2);
        };
//        anonymous class
        Collections.sort(strings, comp);
//      Traverse with iterator
        Iterator<String> i = strings.iterator();

       while (i.hasNext()){
            System.out.print(i.next());
        }

    }
}
