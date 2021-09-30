package ProjectEula;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumSquareDifference {

//    //using formula method
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.println("enter number::: ");
//        int n = in.nextInt();
//        result(n);
//
//
//    }
//
//    static void result(int n){
//
//        int sumSqrs = ((n*n)+ n)/2;
//        int sumOfSquares = (int) Math.pow(sumSqrs,2);
//        int squareOfSums = (n * (n + 1) * ((2*n)+1))/6;
//        int result = sumOfSquares - squareOfSums;
//
//        System.out.println(result);
//    }
//


    static int maxNum = 10000;
    public static void main(String[] args) {



        long num1 = squareOfSum();
        long num2 = eachSquareSum();

        long result = num1 - num2;
        System.out.println("===============");
        System.out.println("difference:::: " + num1 + " - " + num2 + " = " + result);

    }


//    The sum of the squares of the first ten natural numbers is,
//        1sqr + 2sqr + 3sqr ..... + 10sqr = 385
//    The square of the sum of the first ten natural numbers is,
//        (1 + 2 + 3 + ..... + 10)sqr = 3025
//    Hence the difference between the sum of the squares of the first
//    ten natural numbers and the square of the sum is
//        3025 - 385 = 2640
//

    static long eachSquareSum(){
        long sum = 0;

        for (int i = 1; i <= maxNum; i++){
            long squareSum = (long) Math.pow(i,2);
            sum = sum + squareSum;
        }

        System.out.println("num2 = " + sum);
        return sum;

    }

    static long squareOfSum(){
        long sum = 0;
        for (int i = 1; i <= maxNum; i++){
            sum = sum + i;
        }
        long sumTotalSquare = (long) Math.pow(sum,2);
        System.out.println("num1 = " + sumTotalSquare);

        return sumTotalSquare;
    }

    /*

//    hacker rank solution
        public static void main(String[] args) {
            long startTime = System.currentTimeMillis();
            Scanner in = new Scanner(System.in);
            int t = in.nextInt();
            for(int a0 = 0; a0 < t; a0++){
                int n = in.nextInt();
                long num1 = eachSquareSum(n);
                long num2 = squareOfSum(n);
                long difference = num2 - num1;
                long finishTime = System.currentTimeMillis();
                long timeTaken = (finishTime-startTime);
                String timeTakenString = String.valueOf(timeTaken);
                System.out.println(difference);

                System.out.println("Time taken to execute program is " + timeTakenString + " ms");
            }

        }

        static long eachSquareSum(long n){

            long sum = 0;
            //int maxNum = 2;
            for (int i = 1; i <= n; i++){
                long squareSum = (long) Math.pow(i,2);
                sum = sum+squareSum;
            }

            return sum;

        }

        static long squareOfSum(long n){
            long sum = 0;
            for (int i = 1; i <= n; i++){
                sum = sum + i;
            }

            long sumTotalSquare = (long) Math.pow(sum,2);

            return sumTotalSquare;
        }


*/
}

