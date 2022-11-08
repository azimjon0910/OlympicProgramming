package acmp;

import java.util.Scanner;

public class acmp_021 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a, b, c;
        a = scn.nextInt();
        b = scn.nextInt();
        c = scn.nextInt();
        System.out.print(Math.max(Math.max(a, b), c) - Math.min(Math.min(a, b), c));
    }
}
