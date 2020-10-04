package _65_不用加减乘除做加法;

public class Solution {
    public int add(int a, int b) {
        if(b == 0)  return a;
        int c = a ^ b;
        int d = (a & b) << 1;
        return add(c, d);
    }
}
