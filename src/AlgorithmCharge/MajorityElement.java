package AlgorithmCharge;

/*
Given an array of size n, find the majority element.
The majority element is the element that appears more than ⌊ n/2 ⌋ times.
You may assume that the array is non-empty and the majority element always exist in the array.
*/

import java.util.Scanner;

public class MajorityElement {
    public static void main(String[] args) {

        int arr [] = {3,5,4,2,2,3,3};
        int n = arr.length;

        findMajority(arr, n);

    }

    public static void findMajority(int arr[], int size){
        int maxCount = 0;
        int index = -1;
        for (int i = 0; i<size; i++){   // iterate through the array
            int count = 0;              // start counting number of iterations
            for (int j = 0; j<size; j++){
                if (arr[i] == arr[j]){  //
                    count++;
                }
            }
            // update maxCount if count of current element is greater than
            if (count > maxCount){
                maxCount = count;
                index = i;
            }
        }
        // if maxCount is greater than n/2 return the corresponding element
        if(maxCount > size/2){
            System.out.println("Majority element is " + arr[index]);
        }else {
            System.out.println("Majority element does not exist");
        }
    }


}

