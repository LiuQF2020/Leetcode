package _02_数组问题._2_找出数组中出现次数大于数组长度NofK的数;

```java
import java.util.HashMap;
import java.util.HashSet;  
public class FindMajorityK {
      public static void printKMajor(int[] arr, int k){
 
     int n = arr.length, m = n / k;
     HashMap<Integer, Integer> map = new HashMap<>();
     HashSet<Integer> set = new HashSet<>();
     for (int j : arr) {
         if (!map.containsKey(j)) {
             map.put(j, 1);
         } else {
             map.put(j, map.get(j) + 1);
         }
         if (map.get(j) > m) {
             set.add(j);
         }
     }
     if(set.isEmpty()) {
         System.out.println(-1);
     }
     for (int s : set) {
         System.out.print(s + " ");
     }
 }
 
 public static void main(String[] args) {
     int[] arr = {1, 2, 3, 1, 2, 3, 4};
     printKMajor(arr, 7);
 }
}
```