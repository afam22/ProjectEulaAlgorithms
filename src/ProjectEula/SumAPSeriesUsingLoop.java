package ProjectEula;

import java.util.ArrayList;
import java.util.List;

public class SumAPSeriesUsingLoop {

    public static int maxNumber = 1000;

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        int s3 = getMultipleOf3();
        System.out.println(" ");
        int s5 = getMultipleOf5();
        System.out.println(" ");
        int s15 = getMultipleOf15();

        int sum = s3 + s5 - s15;

        System.out.println("=========================");
        System.out.println("****ANSWER**** = " + sum);
        long finishTime = System.currentTimeMillis();
        long timeTaken = finishTime-startTime;
        String timeTakenString = String.valueOf(timeTaken);
        System.out.println("Time taken is " + timeTakenString + " ms");
    }
    public static int getMultipleOf3 (){
        int count = 0;
        int sum = 0;
        for (int i = 1; i < maxNumber; i++ ){
            if( i%3 == 0){
                sum = sum + i;
                //System.out.print(i + ", ");
                count++;
            }

        }
        System.out.println(" ");
        System.out.println("numbers of count for multiple of 3 = " + count);

        System.out.println("sum of multiple of 3 " + sum);
        return sum;
//        List<Integer> listOfMultiplesOfThree = new ArrayList<>();
//        for (int index = 1; index < maxNumber; index++){
//            if (index % 3 == 0){
//                listOfMultiplesOfThree.add(index);
//            }
//        }
//        int sum = 0;
//        for (int index : listOfMultiplesOfThree){
//            System.out.println("Multiple of 3::: " + index);
//            sum += index;
//        }
//
//        return  sum;
    }

    public static int getMultipleOf5 (){
        int count = 0;
        int sum = 0;
        for (int i = 1; i < maxNumber; i++ ){
            if( i%5 == 0){
                sum = sum + i;
                //System.out.print(i + ", ");
                count++;
            }

        }
        System.out.println(" ");
        System.out.println("numbers of count for multiple of 5= " + count);

        System.out.println("sum of multiple of 5 " + sum);
        return sum;
    }

    public static int getMultipleOf15 (){
        int count = 0;
        int sum = 0;
        for (int i = 1; i < maxNumber; i++ ){
            if( i%15 == 0){
                sum = sum + i;
                //System.out.print(i + ", ");
                count++;
            }

        }
        System.out.println(" ");
        System.out.println("numbers of count for multiple of 15= " + count);

        System.out.println("sum of multiple of 15 " + sum);
        return sum;
    }



}
