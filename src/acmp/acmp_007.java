package acmp;

import java.util.Scanner;

public class acmp_007 {
    public static void main(String[] args) {
        String[] a = new Scanner(System.in).nextLine().split("\\s");

        System.out.print(max(max(a[0], a[1]), a[2]));
    }

    static String max(String a, String b) {
        return a.length() > b.length() ? a : b.length() > a.length() ? b : a.compareTo(b) > 0 ? a : b;
    }
}