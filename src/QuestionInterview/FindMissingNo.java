package QuestionInterview;

import java.util.BitSet;

/**
 * Created by m.karandish on 2/4/2019.
 */
public class FindMissingNo {
    public static void main(String[] args) {

        int[] iArray = new int[100]; //25
        int index = 10;
        for(int i = 0 ; i < 100 ; i++){


            if(index==25){
                iArray[i] = 0;
            }else{
                iArray[i]= index ;
            }
            index++;
        }
        int missing = getMissingNumber(iArray, 109);
//        System.out.printf("Missing No : " + missing);
        printMissingNumbers(new int[]{1, 2, 3, 4, 6, 9, 8}, 10); // when more than one number is missing

    }

    private static int getMissingNumber(int[] numbers, int totalCount)
    {
       int notIn = 9 * 10/2 ;

        int expectedSum = totalCount * ((totalCount + 1) / 2);
        expectedSum = expectedSum - notIn;

        int actualSum = 0;
        for (int i : numbers) {
            actualSum += i;
        }
        return expectedSum - actualSum;
    }

    private static void printMissingNumbers(int[] numbers, int count)
    {
        int missingCount = count - numbers.length;
        BitSet bitSet = new BitSet(count);
        for (int number : numbers)
        {
            bitSet.set(number - 1);
        }

        int lastMissingIndex = 0;
        for (int i = 0; i < missingCount; i++) {
            lastMissingIndex = bitSet.nextClearBit(lastMissingIndex);
            System.out.println(++lastMissingIndex);
        }
    }


}
