package ReverseString;

import java.util.Scanner;

public class ReverseString {
    public static void main(String args[]) {
        Scanner str = new Scanner(System.in);
        System.out.println("Enter a String");
        String string = str.nextLine();
        String reverse = "";
        for (int i = string.length() - 1; i >= 0; i--) {
            reverse = reverse + string.charAt(i);

        }
        System.out.println("Reversed String is: " + reverse);
    }

}
