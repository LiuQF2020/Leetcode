package Test;


import java.util.ArrayList;
import java.util.List;

public class Solution {
    private long MidFactor(long val) {
        List<String> lists = new ArrayList<>();
        for(int i = 1; i <= val; i++){
            if(val % i == 0){
                lists.add(String.valueOf(i));
            }
        }

        return Long.parseLong(lists.get((lists.size() - 1)/2));
    }
}