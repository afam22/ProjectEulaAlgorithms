package AlgorithmCharge;

/*
Given an array of integers, return indices of the two numbers such that they add up to a specific target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
Given nums = [2, 7, 11, 15], target = 9,
Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
*/

import java.util.Arrays;
import java.util.Scanner;

public class ArraySumTarget {

    public static void main(String[] args) {
        int [] array2 = new int[2];
        int [] array1 = {2, 7, 11, 15};
        for (int i = 0; i < array1.length; i++){
            for (int j = 0; j < array1.length; j++){
                if (array1[i] + array1[j] == 17){
                    array2[0] = j;
                    array2[1] = i;
                }
            }
        }

        System.out.println(Arrays.toString(array2));

    }



}





































////        Scanner input = new Scanner(System.in);
//
//
//
//        System.out.println ("Enter numbers of input in the array");
////        int num = input.nextInt();



//        // Print out array
//        for (int print : numbers){
//            System.out.print (print + "\t");
//        }

//        input.close();