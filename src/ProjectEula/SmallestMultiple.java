package ProjectEula;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class SmallestMultiple {
    public static void main(String[] args) {

        isMultiple();
    }


    /*
    2520 is the smallest number that can be divided by
    each of the numbers from 1 to 10 without any remainder.

    What is the smallest positive number that is evenly
    divisible by all of the numbers from 1 to 20?
     */

    static List<Long> isMultiple(){
        long biggestMutiple = 11 * 12 * 13 * 14 * 15 * 16 * 17 * 18 * 19 * 20;
        List<Long> multiples = new ArrayList<>();

            for (int j = 21; j <= biggestMutiple; j++){
                if (j % 7 == 0 && j % 8 == 0 && j % 9 == 0 && j % 11 == 0 && j % 12 == 0 && j % 13 == 0 && j % 14 == 0 && j % 15 == 0 && j % 16 == 0 &&
                        j % 17 == 0 && j % 18 == 0 && j % 19 == 0 && j % 20 == 0){
                    multiples.add((long) j);
                }
            }

        System.out.println("size:::: " + multiples.size());
        System.out.println("smallest multiple:::: " + multiples.get(0));

       return multiples;
    }
}
