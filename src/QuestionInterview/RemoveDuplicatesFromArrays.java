package QuestionInterview;

import java.util.*;

/**
 * Created by m.karandish on 2/6/2019.
 */
public class RemoveDuplicatesFromArrays {
    //private static final Logger logger = LoggerFactory.getLogger(TechnicalInterviewTest.class);

    public static void main(String args[]) {

        int[][] test = new int[][]{
                {1, 1, 2, 2, 3, 4, 5},
                {1, 1, 1, 1, 1, 1, 1},
                {1, 2, 3, 4, 5, 6, 7},
                {1, 2, 1, 1, 1, 1, 1},};

        for (int[] input : test) {
            System.out.println("Array with Duplicates       : " + Arrays.toString(input));
            System.out.println("After removing duplicates   : " + Arrays.toString(removeDuplicatesFromArray(input)));
        }
    }

    /*
     * Method to remove duplicates from array in Java, without using
     * Collection classes e.g. Set or ArrayList. Algorithm for this
     * method is simple, it first sort the array and then compare adjacent
     * objects, leaving out duplicates, which is already in the result.
     */
    public static int[] removeDuplicates(int[] numbersWithDuplicates) {

        // Sorting array to bring duplicates together
        Arrays.sort(numbersWithDuplicates);

        int[] result = new int[numbersWithDuplicates.length];
        int previous = numbersWithDuplicates[0];
        result[0] = previous;

        for (int i = 1; i < numbersWithDuplicates.length; i++) {
            int ch = numbersWithDuplicates[i];

            if (previous != ch) {
                result[i] = ch;
            }
            previous = ch;
        }
        return result;

    }

    public static int[] removeDuplicatesFromArray(int[] numbersWithDuplicates){
        int[] numbers = new int[numbersWithDuplicates.length];
        Arrays.sort(numbersWithDuplicates);
        int previous = numbersWithDuplicates[0];
        numbers[0] = previous;
        for (int i=1 ; i<numbersWithDuplicates.length ; i++){
           if(!(numbersWithDuplicates[i]==previous)){
               numbers[i] = numbersWithDuplicates[i];

           }
           previous = numbersWithDuplicates[i];
        }
        return numbers;
    }

    public static void removeDuplicateFromArrayListUsingHashset(){
        //ArrayList with duplicates String
        List<String> duplicateList = (List<String>) Arrays.asList("Android" , "Android", "iOS", "Windows mobile");
        System.out.println("size of Arraylist with duplicates: " + duplicateList.size()); //should print 4 becaues of duplicates Android

        System.out.println(duplicateList);

        //Converting ArrayList to HashSet to remove duplicates
        HashSet<String> listToSet = new HashSet<String>(duplicateList);

        //Creating Arraylist without duplicate values
        List<String> listWithoutDuplicates = new ArrayList<String>(listToSet);
        System.out.println("size of ArrayList without duplicates: " + listToSet.size()); //should print 3 becaues of duplicates Android removed

        System.out.println(listWithoutDuplicates);
    }

    public static void removeDuplicateFromArrayLisWithoutlosingInsertion(){
        //ArrayList with duplicates String
        List<String> duplicateList = (List<String>) Arrays.asList("Android" , "Android", "iOS", "Windows mobile");

        //should print 4 becaues of duplicates Android
        System.out.println("size of Arraylist with duplicates: " + duplicateList.size());
        System.out.println("ArrayList with duplicates: " + duplicateList);

        //Converting ArrayList to HashSet to remove duplicates
        LinkedHashSet<String> listToSet = new LinkedHashSet<String>(duplicateList);

        //Creating Arraylist without duplicate values
        List<String> listWithoutDuplicates = new ArrayList<String>(listToSet);

        //should print 3 becaues of duplicates Android removed
        System.out.println("size of ArrayList without duplicates: " + listToSet.size());
        System.out.println("ArrayList after removing duplicates in same order: " + listWithoutDuplicates);


    }


}
