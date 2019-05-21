import entity.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by m.karandish on 1/2/2019.
 */
public class StatucMethodRefrences {
    public static void main(String[] args) {
        System.out.println("test ");

        StatucMethodRefrences mainClass = new StatucMethodRefrences();
        mainClass.sortData();
        // the sort method is expecting the comparator interface that the interface has a single abstract method
        // which expects two values

    }

    private  void sortData() {

        List<Person> people = new ArrayList<>();

        people.add(new Person("Joe",47));
        people.add(new Person("Mary",30));
        people.add(new Person("Mike",73));

        Collections.sort(people,this :: compareAges);
        people.forEach(p -> System.out.println(p.toString()));
    }

    // it is an instance method of instance method reference class
    public int compareAges(Person p1 , Person p2){
        Integer age1 = p1.getAge();
//        String name = p1.getName();
//        return name.compareTo(p2.getName());
        return age1.compareTo(p2.getAge());
    }
}
