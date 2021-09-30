package AlgorithmCharge;

/*
Given a list of words, write a program to find the longest word made of other words in the list.
        EXAMPLE
        lnput:cat, banana, dog, nana, walk, walker, dogwalker Output: dogwalker
*/

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;

public class WordCombiner {
    public static void main(String[] args) {
        String [] input = enteredWords("cat, banana, dog, nana, walk, walker, catbanana, bananawalker, dogwalker");
        System.out.println(findLongestWord(input));


    }

    public static String[] enteredWords(String input){
        String [] inputArray = input.split(", ");
        return inputArray;
    }

    static String findLongestWord(String[] words) {
        if (words == null || words.length == 0)
            return null;
        HashSet map = new HashSet();
        for (String word : words) {
            map.add(word);
        }
        Arrays.sort(words, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return ((Integer) o2.length()).compareTo(o1.length());
            }
        });
        for (String word : words) {
            if (isBreakable(word, map)) {
                return word;
            }
        }
        return "";
    }
    private static boolean isBreakable(String word, HashSet set){
        boolean[] res = new boolean[word.length()+1];
        res[0] = true;
        for (int i = 0 ; i < word.length();i++){
            StringBuilder str = new StringBuilder( word.substring(0,i+1) );
            for (int j=0;j <= i;j++){
                if (res[j] && set.contains(str.toString())){
                    res[i+1] = true;
                    break;
                }
                str.deleteCharAt(0);
            }
        }
        return res[word.length()];
    }





}
