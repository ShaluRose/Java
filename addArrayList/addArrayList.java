package addArrayList;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class addArrayList {

    public static void main(String[] args){
        int n;
        ArrayList<Integer> list = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        n = in.nextInt();
        System.out.println("Enter the array elements:");
        for(int i=0; i<n; i++){
            list.add(in.nextInt());
        }
        int total=0;
        for(int j=0; j<list.size(); j++){

            total+=list.get(j);
        }
        System.out.println("The sum is:   "+total);
    }
}
