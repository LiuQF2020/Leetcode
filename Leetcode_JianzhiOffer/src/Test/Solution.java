package Test;

public class Solution {
    public static long factorial(int n){
        if (n == 1 || n == 0)  return 1;

        return n * factorial(n - 1) + 1;
    }

    public static void main(String[] args) {
        long res = factorial(4);
        System.out.println(res);
    }
}