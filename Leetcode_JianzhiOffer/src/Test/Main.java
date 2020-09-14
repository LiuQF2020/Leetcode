// 11111
package Test;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int searchInsert(int []A, int target) {
        int high=A.length;
        int low=0;

        while(low<high){
            int mid=(high+low)/2;
            if(A[mid]>=target){
                high=mid;
            }else
                low=mid+1;
        }
        return high;

    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int T=scanner.nextInt();
        for (int i=0;i<T;i++){
            int n=scanner.nextInt();
            int m=scanner.nextInt();
            int [] people=new int[n];
            int [] role=new int[m];
            for (int j=0;j<n;j++){
                people[j]=scanner.nextInt();
            }
            for (int k=0;k<m;k++){
                role[k]=scanner.nextInt();
            }
            Arrays.sort(role);
            for (int q=0;q<people.length;q++){
                int p=searchInsert(role,people[q]);
                if (p>=role.length){
                    people[q]=0;
                }else if (p==0) {
                    people[q]=role.length;
                }else {
                    people[q]=role.length-p;
                }

            }
            for (int u=0;u<people.length;u++){
                if (u==people.length-1){
                    System.out.print(people[u]+"");
                }else {
                    System.out.print(people[u]+" ");
                }
            }
        }
    }
}




