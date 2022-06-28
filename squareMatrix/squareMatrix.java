package squareMatrix;

import java.util.Scanner;

public class squareMatrix {
    public static void main(String[] args) {
        int sum1=0, sum2=0;
        Scanner in = new Scanner(System.in);
        int[][] ar = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                ar[i][j] = in.nextInt();
            }

        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(ar[i][j] +" ");

            }
            System.out.println();
        }
        System.out.println("The sum of diagonal values:");
        for(int i=0; i<3; i++){
            for(int j=0; j<=i; j++){
                if(i==j){
                    sum1+=ar[i][j];
                }

            }
        }
        System.out.println("Sum of first diagonal "+sum1);
        for(int i=0; i<3; i++){
            for(int j=2; j>=0; j--){
                if(i+j==2){
                    sum2+=ar[i][j];
                }
            }
        }
        System.out.println("Sum of second diagonal: "+sum2);
        System.out.println("The diffference is: "+(sum1-sum2));
    }
}
