package ProjectEula;

import java.util.ArrayList;
import java.util.List;

public class _10001stPrime2222222222 {

    public static void main(String[] args) {

            int n = 10001;
            int num=1, count=0, i;
            while (count < n){
                num=num+1;
                for (i = 2; i <= num; i++){
                    if (num % i == 0){              //determines the modulo and compare it with 0
                        break;                      //breaks the loop if the above condition returns true
                    }
                }
                if (i == num){
                    count = count+1;                //increments the count variable by 1 if the number is prime
                }
            }
            System.out.println("The " +n +"th prime number is: " + num);    //prints the nth prime number
        }




}
