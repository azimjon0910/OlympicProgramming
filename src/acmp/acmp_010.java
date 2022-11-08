package acmp;

import java.util.Scanner;

public class acmp_010 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a, b, c, d;
        a = scn.nextShort();
        b = scn.nextShort();
        c = scn.nextShort();
        d = scn.nextShort();
        for (int x = -100; x <= 100; x++)
            if (a * x*x*x + b * x*x + c * x + d == 0)
                System.out.print(x+" ");
    }
}