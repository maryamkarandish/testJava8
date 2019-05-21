/**
 * Created by m.karandish on 1/8/2019.
 */
public class JoiningStrings {
    public static void main(String[] args) {

        String names = String.join("..." , "Maryam","Arash");
        System.out.println(names);

        String[] cities = {"Tehran","Shiraz","Isfahan"};
        String listOfCities = String.join(",",cities);
        System.out.println(listOfCities);
    }
}
