package ProjectEula;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactor {
    public static void main(String args[]){
        primeFactors();


    }

    public static List<Double> primeFactors(){
        List<Double> primeFactors = new ArrayList<>();

        Double number;

        number = 600851475143.0;

        for(int i = 2; i< number; i++) {
            while(number%i == 0) {
                System.out.println(i+" ");
                number = number/i;
            }
        }
        if(number >2) {
            System.out.println(number);
        }


        return primeFactors;
    }


}
