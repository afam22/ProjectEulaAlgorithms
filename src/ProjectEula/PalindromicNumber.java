package ProjectEula;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
public class PalindromicNumber {

    public static void main(String[] args) {
        List<Integer> palindrome = new ArrayList<>();

        for (int i = 100; i < 1000; i++){
            for (int j = 100; j < 1000; j++){
                if(isPalindrome(i*j)){
                    palindrome.add(i * j);
                }
            }
        }

        System.out.println("Size ::: " + palindrome.size());
        Object[] listArray = palindrome.toArray();
        Arrays.sort(listArray);
        System.out.println("List Array " + Arrays.toString(listArray));
        //check number from lowestNumberCheck to highestNumberCheck


    }

    static boolean isPalindrome(int number) {
        String numberAsString = String.valueOf(number);
        char[] numberAsCharacterArray = numberAsString.toCharArray();
        int leftPointer = 0;
        int rightPointer = numberAsCharacterArray.length-1;
        int numberOfElementsForEachPointer = numberAsCharacterArray.length/2;

        for (int i = 0; i < numberOfElementsForEachPointer; i++, leftPointer++, rightPointer--){
            if (numberAsCharacterArray[leftPointer] != numberAsCharacterArray[rightPointer]){
                return false;
            }
        }

        return  true;
    }
}
