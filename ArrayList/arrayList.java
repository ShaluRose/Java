package ArrayList;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;


public class arrayList {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int a,b,c;
        a=in.nextInt();
        b=in.nextInt();
        c=in.nextInt();

        //add elements to the list
        list.add(a);
        list.add(b);
        list.add(c);
        System.out.println(list);

        //get elements from the list
        int element = list.get(1);
        System.out.println(element);

        //add elements in between the list
        list.add(1,4);
        System.out.println(list);

//        change elements in the list
        list.set(2, 7);
        System.out.println(list);

        //delete element
        list.remove(3);
        System.out.println(list);

        //return size of array list
        System.out.println(list.size());

        //loop
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
        //sorting -- for lists
        Collections.sort(list);
        System.out.println(list);

    }
}
