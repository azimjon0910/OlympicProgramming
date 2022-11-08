package acmp;

import java.util.Scanner;

public class acmp_294 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int boltBefore = scn.nextInt();
        int boltLostPercent = scn.nextInt();
        int boltCost = scn.nextInt();
        int nutBefore = scn.nextInt();
        int nutLostPercent = scn.nextInt();
        int nutCost = scn.nextInt();
        int boltAfter = boltBefore * (100 - boltLostPercent) / 100;
        int nutAfter = nutBefore * (100 - nutLostPercent) / 100;
        int pairsAfter = Math.min(boltAfter, nutAfter);
        int totalCostBefore = boltBefore * boltCost + nutBefore * nutCost;
        int totalCostAfter = pairsAfter * (boltCost + nutCost);
        System.out.print(totalCostBefore - totalCostAfter);
    }
}
