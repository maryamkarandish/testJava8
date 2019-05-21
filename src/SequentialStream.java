import entity.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.function.Predicate;

/**
 * Created by m.karandish on 1/5/2019.
 */
public class SequentialStream {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<Person>();

        people.add(new Person("Joe" ,48));
        people.add(new Person("Mary" ,30));
        people.add(new Person("Mike" ,73));

        Predicate<Person> pred = (p) -> p.getAge() > 65;

        displayName(people,pred);

    }

    private static void displayName(List<Person> people, Predicate<Person> pred) {
        System.out.println("Selected: ");
//        people.forEach(person -> {
//            if(pred.test(person)){
//                System.out.print(person.toString());
//            }
//        });
//      forEach method required a lambda expression
        people.stream().filter(pred).forEach( p -> System.out.println(p.getName()));

        int sum = people.stream().mapToInt(p -> p.getAge()).sum();
        System.out.println("Sum of Agese = " + sum);
        OptionalDouble avg = people.stream().mapToInt(p -> p.getAge()).average();
        if (avg.isPresent()) {
            System.out.println("Average : " + avg.getAsDouble());
        } else {
            System.out.println("Average is not Calculated");
        }
    }
}
