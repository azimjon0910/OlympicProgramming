package acmp;

import java.util.Scanner;

public class acmp_008 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        System.out.print(a*b == c ? "YES" : "NO");
    }
}
