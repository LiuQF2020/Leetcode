package Test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Character> set1 = new HashSet<>();
        Set<Character> set2 = new HashSet<>();

        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        for (int i = 0; i < str1.length(); i++) {
            set1.add(str1.charAt(i));
        }
        int j = 0;
        for (int i = 0; i < str2.length(); i++) {
            set2.add(str1.charAt(i));
        }

        Iterator iter2 = set2.iterator();
        while (iter2.hasNext()) {
            Character i = (Character) iter2.next();
            if (set1.contains(i)) {
                j++;
            }
        }
        System.out.println(j);
    }
}
