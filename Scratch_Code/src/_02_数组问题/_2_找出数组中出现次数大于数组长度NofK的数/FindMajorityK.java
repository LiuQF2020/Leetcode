package _02_数组问题._2_找出数组中出现次数大于数组长度NofK的数;

import java.util.HashMap;
import java.util.HashSet;

public class FindMajorityK {

    public static void printKMajor(int[] arr, int k){
        int n = arr.length, m = n / k;
        HashMap<Integer, Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            if (!map.containsKey(num)) {
                map.put(num, 1);
            } else {
                map.put(num, map.get(num) + 1);
            }

            if(map.get(num) > m) {
                set.add(num);
            }
        }

        for (int mem : set) {
            System.out.print(mem + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 2, 3, 4};
        printKMajor(arr, 7);
    }
}
