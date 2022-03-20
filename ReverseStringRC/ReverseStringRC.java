package ReverseStringRC;

import java.util.Scanner;

public class ReverseStringRC {
    public static void main(String[] args) {
       ReverseStringRC rvS = new ReverseStringRC();
       Scanner str = new Scanner(System.in);
       System.out.println("Enter a String: ");
       String newString = str.nextLine();
       String reverse = rvS.reverseString(newString);
       System.out.println("The reversed String is: "+reverse);

    }

    public String reverseString(String passedStr) {
        if(passedStr.length() == 1)
            return passedStr;
        else
            return passedStr.charAt(passedStr.length()-1)+reverseString(passedStr.substring(0, passedStr.length()-1));
    }
}
