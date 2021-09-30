package ProjectEula;

import java.util.ArrayList;
import java.util.List;


//By listing the first six prime numbers: 2,3,5,7,11 and 13,
//we can see that the 6th prime no is 13.
//find the nth prime number
public class _10001stPrime {
    static List<Integer> primeArray = new ArrayList<>();
    static int N = 1_000_005;

    public static void main(String[] args) {
        int n = 10001;
        //System.out.println("prime nos smaller than or equal to  " + n);
        sieveOfEratosthenes();
        System.out.println(primeArray.get(n-1));


    }

    static void sieveOfEratosthenes(){


        // Create a boolean array "prime[0..n]" and
        // initialize all entries as true.
        // A value in prime[i] will finally be false if i is Not a prime, else true.

        boolean prime[] = new boolean[N + 1];
        for (int i = 0; i<= N; i++){
            prime[i] = true; //all indices to the nth term entering are initialized as true
        }
        for (int p = 2; p*p <= N; p++){
            if (prime[p] == true){
                for (int i = p * p; i <= N; i = i + p){
                    prime[i] = false;
                }
            }
        }

        for (int i = 2; i <= N; i++){
            if (prime[i] == true){
                primeArray.add(i);
            }

        }

    }



}




/*
    public static void main(String[] args) {
        System.out.println("Prime numbers from 1 to 100 ");
        List<Integer> primeNo = new ArrayList<>();

        for (int i = 2; i <= 100; i++){
            if (isPrime(i)){
                System.out.println(i);;
            }
        }
        //System.out.println(primeNo);
    }

    static boolean isPrime(int num){
        if (num == 2 || num == 3){
            return true;
        }
        if (num % 2 == 0 || num % 3 == 0){
            return false;
        }

        for (int i = 3; i < Math.sqrt(num); i = i + 2){
            if (num % i == 0 || num % Math.sqrt(num) == 0){
                return false;
            }
        }
        return true;
    }*/
