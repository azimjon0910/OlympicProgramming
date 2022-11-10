package attp_vstu_edu;

/* attp.vstu.edu.ru   |   Задание №1499
            Зоопарк            

Пример:
---------------------------------
|№ |  INPUT.TXT  |  OUTPUT.TXT  |
|-------------------------------|
|1 |3            |2             |
|2 |4            |6             |
---------------------------------

*/

import java.util.Scanner;

public class attp_1499 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.print(n * (n - 3) + 2);
    }
}