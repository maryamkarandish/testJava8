package QuestionInterview;

/**
 * Created by m.karandish on 1/28/2019.
 */
public class Palindrome {
    public static boolean isPalindrome(String word) {
        //throw new UnsupportedOperationException("Waiting to be implemented.");
        int length = word.length();
        word = word.toLowerCase();
        int end = length-1;
        for(int i = 0 ; i< (length/2); i++){
            System.out.println("i: "+word.charAt(i)+" end : "+word.charAt(end));
//            if(word.toUpperCase().charAt(i)== word.toUpperCase().charAt(end)){
            if(word.charAt(i) != word.charAt(end)){
                return false;
            }
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(Palindrome.isPalindrome("Deleveled"));
    }
}
