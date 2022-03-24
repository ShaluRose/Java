package AnagramArraySort;


import java.util.Arrays;
import java.util.Scanner;


public class AnagramArraySort {
    public static void main(String[] args){
        System.out.println("Enter a String");
        Scanner str = new Scanner(System.in);
        String word = str.nextLine();
        System.out.println("Enter another String");
        String anagram = str.nextLine();

        System.out.println("Are they anagrams? : "+ isAnagramUsingArraySort(word, anagram));
    }

    public static boolean isAnagramUsingArraySort(String word, String anagram) {
        String sortedWord = sortChars(word);
        String sortedAnagram = sortChars(anagram);
        return sortedWord.equals(sortedAnagram);
    }
    public static String sortChars(String check){
        char[] checkWord = check.toLowerCase().toCharArray();
        Arrays.sort(checkWord);
        return String.valueOf(checkWord);
    }
}
