package ProjectEula;

public class ArithmeticProgression {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        double s3 = sumMultiplesOf3();
        double s5 = sumMultiplesOf5();
        double s15 = sumMultiplesOf15();
        double sum = (s3 + s5) - s15;
        long finishTime = System.currentTimeMillis();
        long timeTaken = finishTime-startTime;
        String timeTakenString = String.valueOf(timeTaken);
        System.out.println("Sum of multiples = " + sum);
        System.out.println("Time taken is " + timeTakenString + " ms");
    }

    // nthTerm = firstTerm + (n-1)diff
    //:. n = (nthTerm - firstTerm)/
    private static double sumMultiplesOf15() {
        double nthTerm = 990;
        double firstTerm = 15;
        double diff = 15;
        double n15 = ((nthTerm - firstTerm)/diff) + 1;

        double sum15 = (n15/2)*(firstTerm+nthTerm);
        //System.out.println(sum15);

        return sum15;
    }


    public static double sumMultiplesOf3(){
        double nthTerm = 999;
        double firstTerm = 3;
        double diff = 3;
        double nterms = ((nthTerm - firstTerm)/diff) + 1;

        double sum3 = (nterms/2)*(firstTerm+nthTerm);
        System.out.println(sum3);

        return sum3;
    }

    public static double sumMultiplesOf5(){
        double nthTerm = 995;
        double firstTerm = 5;
        double diff = 5;
        double n5 = ((nthTerm - firstTerm)/diff) + 1;

        double sum5 = (n5/2)*(firstTerm+nthTerm);

        return sum5;
    }

}
