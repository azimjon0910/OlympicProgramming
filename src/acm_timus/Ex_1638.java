package acm_timus;

import java.util.Scanner;

public class Ex_1638 {
    public static void main(String[] args) {
        Scanner scn = new Scanner((System.in));
        int tw = scn.nextInt();
        int bw = scn.nextInt();
        int s = scn.nextInt();
        int e = scn.nextInt();
        System.out.print(Math.abs(2 * (e - s) * bw + (e - s - 1) * tw));
    }
}
