package acmp;

/* acmp.ru   |   Задание №680
        Садовник-художник
(Время: 1 сек. Память: 16 Мб Сложность: 28%)

Садовник посадил N деревьев в один ряд. После посадки деревьев садовнику нужно их покрасить. В его распоряжении есть
краска трех цветов: белая, синяя и оранжевая. Сколько способов покраски деревьев есть у него, если никакие два
соседних дерева нельзя красить в одинаковый цвет?



Входные данные
В единственной строке входного файла INPUT.TXT записано одно натуральное число - количество деревьев N (1 ≤ N ≤ 50).


Выходные данные
В единственную строку выходного файла OUTPUT.TXT нужно вывести одно число - количество способов покраски.


Пример:
---------------------------------
|№ |  INPUT.TXT  |  OUTPUT.TXT  |
|-------------------------------|
|1 |3            |12            |
---------------------------------


Решение.
1 -> 3 = 3
2 -> 6 = 3 * 2
3 -> 12 = 3 * 2 * 2
...
n -> 3 * 2^(n-1) = 3 << (n-1)

Максимально возможный случай: 50 -> 3 * 2^49 = 1 688 849 860 263 936 ≈ 1.688849e+15
1.688849e+15 > int ≈ 2.147483e9
1.688849e+15 < long ≈ 9.223372e+18
*/

import java.util.Scanner;

public class acmp_680 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.print(3L << (n - 1));
    }
}
