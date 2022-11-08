package acmp;

import java.util.Scanner;

public class acmp_685 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a1, a2, a3, b1, b2, b3;
        a1 = scn.nextInt();
        a2 = scn.nextInt();
        a3 = scn.nextInt();
        b1 = scn.nextInt();
        b2 = scn.nextInt();
        b3 = scn.nextInt();
        int maxA, maxB, minA, minB, sA, sB;
        maxA = Math.max(Math.max(a1, a2), a3);
        maxB = Math.max(Math.max(b1, b2), b3);
        minA = Math.min(Math.min(a1, a2), a3);
        minB = Math.min(Math.min(b1, b2), b3);
        sA = (a1 < maxA && a1 > minA) ? a1 : (a2 < maxA && a2 > minA) ? a2 : a3;
        sB = (b1 < maxB && b1 > minB) ? b1 : (b2 < maxB && b2 > minB) ? b2 : b3;

        System.out.print(maxA*maxB + sA*sB + minA*minB);
    }
}
