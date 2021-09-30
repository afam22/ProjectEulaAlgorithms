package AlgorithmCharge;

import java.util.Arrays;

/*Given a 32-bit signed integer, reverse digits of an integer.
  Example 1:
        Input: 123
        Output: 321
  Example 2:
        Input: -123
        Output: -321
  Example 3:
        Input: 120
        Output: 21
 */
public class ReverseDigit {
    public static void main(String[] args) {
        int no = 1200;
        String negativeNo = Integer.toString(no);
        System.out.println("input number = " + no);
        System.out.println(" ");
        String []backward = reverseArray(inputArray(no),inputArray(no).length);
        String join = "";
        String result = String.join(join,backward);
        int res = Integer.parseInt(result);
        if(negativeNo.charAt(0) == '-'){
            System.out.println("reversed number = " + "-"+res);
        }else {

            System.out.println("reversed number = " + res);
        }
    }

    //convert input to array
    public static String[] inputArray(int number){
        //convert number to string
        String numTemplate = Integer.toString(number);
        if (numTemplate.charAt(0) != '-'){
        String [] inputNumber = new String[numTemplate.length()];
        for (int i = 0; i < inputNumber.length; i++){
            inputNumber[i]= String.valueOf((numTemplate.charAt(i)) - '0');
            }return inputNumber;
        }else {
            number = -1 * number;
            String numTemplate2 = Integer.toString(number);
            String[] inputNumber = new String[numTemplate2.length()];
            for (int i = 0; i < inputNumber.length; i++) {
                inputNumber[i] = String.valueOf((numTemplate2.charAt(i)) - '0');
            }return inputNumber;
        }
    }


    public static String[] reverseArray(String[] input, int n){
        String [] inputNumber2 = new String[n];
        int size = n;
        for (int i = 0; i < n ; i++){
            inputNumber2[size - 1] = input[i];
            size = size - 1;
        }
        return inputNumber2;
    }


}
