package Test;


import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> tmp = new ArrayList<>();
        int[] arr = new int[5];
        int[] arr_ = new int[5];
        for (int i = 0; i < arr.length; i++) {
            tmp.add(i);
        }
        for (int i = 0; i < arr_.length; i++) {
            arr_[i] = tmp.get(i);
        }
        System.out.println(Arrays.toString(arr_));

    }
}




