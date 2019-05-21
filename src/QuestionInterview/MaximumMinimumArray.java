package QuestionInterview;

/**
 * Created by m.karandish on 2/4/2019.
 */
public class MaximumMinimumArray
{
    public static void main(String args[]) {
        largestAndSmallest(new int[]{-20, 34, 21, -87, 92});
        largestAndSmallest(new int[]{10, 0, -2});
        largestAndSmallest(new int[]{Integer.MAX_VALUE, 40, Integer.MAX_VALUE});
        largestAndSmallest(new int[]{1, -1, 0});
    }
        public static void largestAndSmallest(int[] numbers)
        {
            int largest = Integer.MIN_VALUE;
            int smallest = Integer.MAX_VALUE;
            for (int number : numbers)
            {
                if (number > largest)
                {
                    largest = number;
                } else if (number < smallest)
                {
                    smallest = number;
                }
            }
            //System.out.println("Given integer array : " + Arrays.toString(numbers));
            System.out.println("Largest number in array is : " + largest);
            System.out.println("Smallest number in array is : " + smallest);
        }

}
