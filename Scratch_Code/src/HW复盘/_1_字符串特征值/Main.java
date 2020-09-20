package HW复盘._1_字符串特征值;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static String getFeature(String s, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) - '0' < n) {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }

    public static boolean isSub(String parent, String sub) {
        if (sub.length() == 0)  return true;
        if (parent.length() == 0)   return false;
        for (int i = 0; i <= parent.length() - sub.length(); i++) {
            for (int j = 0; j < sub.length(); j++) {
                if (parent.charAt(i + j) == sub.charAt(j)) {
                    if (j == sub.length() - 1) {
                        return true;
                    }
                }
                else {
                    break;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> list = new LinkedList<>();
        while (true) {
            String tmp = sc.nextLine();
            list.add(tmp);
            if (tmp.length() == 1) {
                break;
            }
        }
        list.add(sc.nextLine());
        int n = list.size();
        int base_num = Integer.parseInt(list.get(n - 2));
        String subFeature = getFeature(list.get(n - 1), base_num);

        for (int i = 0; i < n - 2; i++) {
            if (isSub(getFeature(list.get(i), base_num), subFeature)) {
                System.out.println(list.get(i));
            }
        }

    }
}
