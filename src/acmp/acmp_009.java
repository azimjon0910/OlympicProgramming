package acmp;

import java.util.Scanner;

public class acmp_009 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int min_idx = 0;
        int max_idx = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
            if (arr[i] > 0) sum += arr[i];
            if (arr[i] < min) {
                min = arr[i];
                min_idx = i;
            }
            if (arr[i] > max) {
                max = arr[i];
                max_idx = i;
            }
        }
        if (min_idx > max_idx) {
            int t = min_idx;
            min_idx = max_idx;
            max_idx = t;
        }
        max = 1;
        for (int i = min_idx + 1; i < max_idx; i++)
            max *= arr[i];

        System.out.print(sum + " " + max);
    }
}

/* Краткая версия
import java.util.Scanner;
public class A {
    public static void main(String[] args) {
        Scanner q = new Scanner(System.in);
        int i, n, x, y, s, l, r, a[];
        n = q.nextInt();
        a = new int[n];
		x = 100;
        y = -100;
        s = l = r = i = 0;
        for (; i < n; i++) {
            a[i] = q.nextInt();
            if (a[i] > 0) s += a[i];
            if (a[i] < x) x = a[l = i];
            if (a[i] > y) y = a[r = i];
        }
        if (l > r) l = l ^ r ^ (r = l);
        x = a[i = l+1];
        while (i < r-1)
            x *= a[++i];
        System.out.print(s + " " + x);
    }
}
 */