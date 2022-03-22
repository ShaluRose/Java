package ReverseStringBuffer;

import java.util.Scanner;

public class ReverseStringBuffer {
    public static void main(String[] args){
        System.out.println("Enter your first String: ");
        Scanner str1 = new Scanner(System.in);
        String word = str1.nextLine();
        System.out.println("Enter your second String: ");
        Scanner str2 = new Scanner(System.in);
        String anagram = str2.nextLine();

        System.out.println("Anagram? : " + isAnagramUsingStringMethod(word, anagram));

    }
    public static boolean isAnagramUsingStringMethod(String word, String anagram)
    {
        if(word.length() != anagram.length())
        return false;

        for(int i =0; i<word.length(); i++){
            char c = word.charAt(i);
            int index = anagram.indexOf(c);

            if(index != -1){
                anagram = anagram.substring(0, index) + anagram.substring(index +1);
            }else
                return false;
        }
        return anagram.isEmpty();
    }
}
