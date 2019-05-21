import entity.Person;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Created by m.karandish on 1/5/2019.
 */
public class ArrayToStream {
    public static void main(String[] args) {
        Person[] people = {
                new Person("Joe", 37),
                new Person("Mike", 56),
                new Person("Mary",30)
        };
//        for(int i =0 ; i<people.length; i++){
//            System.out.println(people[i].toString());
//        }
//        Stream<Person> stream = Stream.of(people);
        Stream<Person> stream = Arrays.stream(people);
        stream.forEach(p -> System.out.println(p.toString()));
    }
}
