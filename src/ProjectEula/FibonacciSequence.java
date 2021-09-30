package ProjectEula;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class FibonacciSequence {
    public static void main(String[] args) {


        List<Double> fib = fibonacciOfN(33);
        double sum = 0.0;
        for (Double number : fib){
            if (number % 2 == 0) {
                sum += number;
            }
        }

        System.out.println("Sum " + sum);
    }

    static List<Double> fibonacciOfN(int n){
        List<Double> listOfFibGuys = new ArrayList<>();
        listOfFibGuys.add(1.0);
        listOfFibGuys.add(2.0);



            for (int index = 2; index < n; index++) {
                listOfFibGuys.add(index, (listOfFibGuys.get(index-1) + listOfFibGuys.get(index - 2)));
            }
        System.out.println(listOfFibGuys.get(n-1));
        System.out.println(listOfFibGuys.size());


       return listOfFibGuys;

//        if (n == 0){
//          return 0;
//        }else if (n == 1){
//            return 1;
//        }else if (n == 2){
//            return 2;
//        } else {
//            return fibonacciOfN(n-1) + fibonacciOfN(n-2);
//        }
    }

}
