package Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private  static List<Integer>list=new ArrayList<>();
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();
        int n=scanner.nextInt();
        for (int i=0;i<n;i++){
            int l=scanner.nextInt();
            int r=scanner.nextInt();
            String cur=input.substring(l-1,r);
            list.add(minCut(cur));
        }
        for (int i:list){
            System.out.println(i+1);
        }
    }
    public static int  minCut(String s) {
        if(s == null||s.length() == 0)
            return 0;
        int[] dp=new int[s.length()];
        dp[0]=0;
        for(int i=1;i<s.length();i++)
        {
            dp[i]=is_palindrome(s.substring(0,i+1))?0:i+1;
            for(int j=i;j>=1;j--)
            {
                if(is_palindrome(s.substring(j,i+1)))
                {
                    dp[i]=Math.min(dp[i],dp[j-1]+1);
                }
            }
        }
        return dp[s.length()-1];
    }
    public static boolean is_palindrome(String s)
    {
        int begin=0;
        int end=s.length()-1;
        while(begin<end)
        {
            if(s.charAt(begin)!=s.charAt(end))
                return false;
            begin++;
            end--;
        }
        return true;
    }
}




