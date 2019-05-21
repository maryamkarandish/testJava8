package QuestionInterview;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by m.karandish on 1/29/2019.
 */
public class MergeNames {
    public static String[] uniqueNames(String[] names1, String[] names2) {
//        throw new UnsupportedOperationException("Waiting to be implemented.");
        List<String> names3 = new ArrayList<>();
        boolean findSmilarity = false;
        for(int i=0 ; i<names1.length;i++) {
            if (names3.contains(names1[i]) == false) {
                names3.add(names1[i]);
            }
        }
        for (int j=0;j<names2.length;j++){
            if(names3.contains(names2[j])==false){
                names3.add(names2[j]);
            }
        }
        return names3.toArray(new String[0]);

    }

    public static void main(String[] args) {
        String[] names1 = new String[] {"Ava", "Emma", "Olivia"};
        String[] names2 = new String[] {"Olivia", "Sophia", "Emma"};
        System.out.println(String.join(", ", MergeNames.uniqueNames(names1, names2))); // should print Ava, Emma, Olivia, Sophia
    }
}
