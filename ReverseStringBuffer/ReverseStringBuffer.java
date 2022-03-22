package ReverseStringBuffer;

import java.util.Scanner;

public class ReverseStringBuffer {
    public static void main(String[] args){
       System.out.println("Enter a String");
        Scanner str = new Scanner(System.in);
        String string = str.nextLine();
        StringBuffer strB = new StringBuffer(string);
        System.out.println("The reverse of your entered String: "+strB.reverse());
    }
}

