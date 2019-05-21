package QuestionInterview;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by m.karandish on 1/31/2019.
 * Write a function that, when passed a list and a target sum, returns, efficiently with respect to time used,
 * two distinct zero-based indices of any two of the numbers, whose sum is equal to the target sum.
 * If there are no two numbers, the function should return null.
 For example, findTwoSum(new int[] { 3, 1, 5, 7, 5, 9 }, 10) should return a single dimensional array with
 two elements and contain any of the following pairs of indices:

 0 and 3 (or 3 and 0) as 3 + 7 = 10
 1 and 5 (or 5 and 1) as 1 + 9 = 10
 2 and 4 (or 4 and 2) as 5 + 5 = 10
 */
public class TwoSum {
//    ---------------------------------------------------------------    75%
    public static int[] findTwoSum(int[] list, int sum) {
        //throw new UnsupportedOperationException("Waiting to be implemented.");
        int listLength=list.length;
        int[] match=new int[2];

        for(int i=0; i<listLength; i++){

            for(int j=0; j<i; j++){
                if(list[i]+list[j]==sum){
                    match[0]=i;
                    match[1]=j;
                    return match;
                }
            }
        }
        return null;
    }
// -------------------------------------------------------------------  50%
// public static int[] findTwoSum(int[] list, int sum) {
//
//     HashMap<Integer,Integer> list1 = new HashMap<Integer,Integer>();
//     int[] match=new int[2];
////     for(int i=0; i<list.length; i++){
////         list1.put(list[i],i);
////     }
//     for (int i=0; i<list.length; i++){
//
//         if(!list1.containsKey(list[i]))
//             list1.put(list[i],0);
//
//         list1.put(list[i],i);
//     }
//     for(int i=0; i<list.length; i++){
//
//         int diff = sum - list[i];
//         if(diff != i){
//             if(list1.containsKey(diff)){
//                 match[0] = i;
//                 match[1] = list1.get(diff);
//                 return match;
//             }
//         }
//
//     }
//        return null;
//    }


    public static void main(String[] args) {
        int[] indices = setSumPair(new int[] { 3, 1, 5, 7, 5, 9 }, 10);
        if(indices != null) {
            System.out.println(indices[0] + " " + indices[1]);
        }
    }

    // -------------------------------------------------------simplest with O(n^2) --------------
    public static void printPairs(int[] array, int sum)
    {
        for (int i = 0; i < array.length; i++)
        {
            int first = array[i];
            for (int j = i + 1; j < array.length; j++)
            {
                int second = array[j];
                if ((first + second) == sum) {
                    System.out.printf("(%d, %d) %n", first, second);
                }
            }
        }
    }
    //------------------------------better way O(N) -----------------------------
    /** * Given an array of integers finds two elements in the array whose sum is equal to n. * @param numbers * @param n */

    public static int[] setSumPair(int[] number, int sum){
        Set set = new HashSet(number.length);
        int[] result = new int[2];
        if (number.length<2){
            return null;
        }
        for(int n : number){
            int target = sum - n;
            if(!set.contains(target)){
                set.add(n);
            }else{
                System.out.println("first: " + n + " second: " + target);
                result[0] = n;
                result[1] = target;

            }
        }
        return result;
    }

    public static int[] getRandomArray(int length){
        int[] randoms = new int[length];
        for(int i=0; i<length; i++){
            randoms[i] = (int) (Math.random()*15);
        }
        return randoms;
    }

    // when interviewer asked to implement a method without any additional space
    public static void printPairsUsingTwoPointers(int[] numbers, int k)
    {
        if(numbers.length < 2)
        {
            return;
        }
        Arrays.sort(numbers);
        int left = 0;
        int right = numbers.length -1;
        while(left < right)
        {
            int sum = numbers[left] + numbers[right];
            if(sum == k)
            {
                System.out.printf("(%d, %d) %n", numbers[left], numbers[right]); left = left + 1; right = right -1;
            }
            else if(sum < k){
                left = left +1;
            }
            else if (sum > k) {
                right = right -1;
            }
        }
    }




}
