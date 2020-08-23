package written_examination.Tencent;

import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while(T-- > 0){
            long n = sc.nextLong();
            System.out.println(unknownMethod(n));
//            System.out.println(rightMethod(n));
        }
    }
    public static long unknownMethod(long n){
        long mod = n % 10;

        return getDigitSum(n -  mod - 1) + 1 + mod;
    }

//    public static int rightMethod(int n){
//        int maxSum = Integer.MIN_VALUE;
//        for(int i = 0; i <= n; i++){
//            int temp = getDigitSum(i) + getDigitSum(n - i);
//            maxSum = Math.max(temp,maxSum);
//        }
//        return maxSum;
//    }

    public static int getDigitSum(long num){
        String str = String.valueOf(num);
        int result = 0;
        for(int i = 0; i < str.length(); i++){
            result += (str.charAt(i) - '0');
        }
        return result;
    }
}
