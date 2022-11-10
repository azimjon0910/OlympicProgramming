package acmp;

import java.util.Scanner;

public class acmp_263 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int i = scn.nextInt();
        int j = scn.nextInt();
        int maxStation = Math.max(i, j);
        int minStation = Math.min(i, j);
        System.out.print(Math.min(maxStation - minStation - 1, n - maxStation + minStation - 1));
    }
}
