package _05_replaceSpace_00;

public class Solution {

    public String replaceSpace(String s) {
        StringBuilder res = new StringBuilder();
        for(Character c : s.toCharArray())
        {
            if(c == ' ') {
                res.append("%20");
            }
            else res.append(c);
        }
        return res.toString();
    }


    public static void main(String[] args) {

    }
}
