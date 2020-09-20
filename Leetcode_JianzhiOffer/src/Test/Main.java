package Test;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Character> set = new HashSet<>();

        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
//        sc.nextLine();
        String str2 = sc.nextLine();

        for (int i = 0; i < str1.length(); i++) {
            set.add(str1.charAt(i));
        }
        int j = 0;
        for (int i = 0; i < str2.length(); i++) {
            if (set.contains(str2.charAt(i))) {
                j++;
            }
        }
        System.out.println(j);
    }
}
