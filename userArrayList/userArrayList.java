package userArrayList;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class userArrayList {
    public static void main(String[] args){
        int n;
        ArrayList<Integer> list = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        n = in.nextInt();
        System.out.println("Enter the Array elements:");
        for(int i=0; i<n; i++){

            list.add(in.nextInt());

        }
        System.out.println(list);
        System.out.println("After sorting:");
        Collections.sort(list);
        System.out.println(list);
    }
}
