package attp_vstu_edu;

/* attp.vstu.edu.ru   |   Задание №819
            Зоопарк            

Пример:
---------------------------------
|№ |  INPUT.TXT  |  OUTPUT.TXT  |
|-------------------------------|
|1 |3            |32            |
---------------------------------

*/

import java.util.Scanner;

public class attp_819 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.print(n * n * (n * n - 1) - (8 * n * n - 12 * n + 4));
    }
}