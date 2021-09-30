package AlgorithmCharge;

/*
Write a program that outputs the string representation of numbers from 1 to n.
But for multiples of three it should output “Fizz” instead of the number and for the
multiples of five output “Buzz”. For numbers which are multiples of both three and five output “FizzBuzz”.
Example:
n = 15,
Return:
["1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"]
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class fizzbuzz {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(toStringArray(30)));
    }




    public static String[] toStringArray(int n){
        String[] result = new String[n];
        for (int i = 0; i< n; i++){
          result[i] = String.valueOf(i + 1);
        }

        for (int i = 0; i < n; i++){

            if (Integer.parseInt(result[i]) % 15 == 0){
                result[i] = "FizzBuzz";
            }else if (Integer.parseInt(result[i]) % 5 == 0){
                result[i] = "Buzz";
            }else if (Integer.parseInt(result[i]) % 3 == 0) {
                result[i] = "Fizz";
            }

        }

        return result;
    }










}
