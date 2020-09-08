package Test;


import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        arr[0][1] = 2;
        arr[0][n - 2] = 1;

        arr[1][0] = 3;
        arr[1][n - 1] = 8;

        arr[n - 2][0] = 4;
        arr[n - 2][n - 1] = 7;

        arr[n - 1][1] = 5;
        arr[n - 1][n - 2] = 6;

        int t = 0;
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]);
                System.out.print(" ");
                t++;
                if(t % n == 0)
                    System.out.println();
            }

        // System.out.println(Arrays.deepToString(arr));
    }
}




