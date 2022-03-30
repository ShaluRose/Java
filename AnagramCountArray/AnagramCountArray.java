package AnagramCountArray;

import java.util.Scanner;

public class AnagramCountArray {
    public static void main(String[] args){
        Scanner str1 = new Scanner(System.in);
        System.out.println("Enter a String :");
        String word = str1.nextLine();
        System.out.println("Enter a String :");
        Scanner str2 = new Scanner(System.in);
        String anagram = str2.nextLine();
        System.out.println("Anagram? :" + isAnagram(word, anagram));

    }
    public static boolean isAnagram(String word, String anagram){
        if(word.length() != anagram.length()) {
            return false;
        }
        int[] count = new int[256];
        for(int i=0; i<word.length(); i++){
            count[word.charAt(i)]++;
            count[anagram.charAt(i)]--;
        }
        for(int i =0; i<256; i++){
            if(count[i] !=0){
                return false;
            }
        }
        return true;
    }
}
