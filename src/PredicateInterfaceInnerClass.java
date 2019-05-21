import entity.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by m.karandish on 1/2/2019.
 */
public class PredicateInterfaceInnerClass {
    public static void main(String[] args){

        List<Person> people = new ArrayList<>();

        people.add(new Person("Joe",47));
        people.add(new Person("Mary",30));
        people.add(new Person("Mike",73));

//        filter List with inner class syntax
//        make an instace of Predicate interface
        Predicate<Person> pred = new Predicate<Person>() {
            @Override
            public boolean test(Person person) {
                return (person.getAge()>= 65);
            }
        };
//        Traverse object to print the items
        people.forEach(person -> {
            if(pred.test(person)){
                System.out.print(person.toString());
            }
        });
    }
}
