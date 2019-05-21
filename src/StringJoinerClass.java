import java.util.Set;
import java.util.StringJoiner;
import java.util.TreeSet;

/**
 * Created by m.karandish on 1/8/2019.
 */
public class StringJoinerClass {
    public static void main(String[] args) {
        //Create StringJoiner Objest
        StringJoiner sj = new StringJoiner(",","(",")");
        sj.setEmptyValue("There is no Value");
//        System.out.println(sj);

        sj.add("Maryam").add("Arash").add("Karandish").add("Ali");
        System.out.println(sj);

        //Making String joiner instances
        StringJoiner sj2 = new StringJoiner(",");
        sj2.add("Reza");
        sj.merge(sj2);
        System.out.println(sj);

        //working with collections
        Set<String> set = new TreeSet<String>();
        set.add("Tehran");
        set.add("Shiraz");
        set.add("Isfahan");

        StringJoiner sj3 = new StringJoiner(" and ");
        set.forEach(s -> sj3.add(s));
        System.out.println(sj3);

    }
}
