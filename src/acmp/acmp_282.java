package acmp;

/* acmp.ru   |   Задание №282
            Прямоугольники
(Время: 1 сек. Память: 16 Мб Сложность: 32%)

Найдите количество невырожденных прямоугольников со сторонами, параллельными осям координат, вершины которых лежат в точках
с целыми координатами внутри или на границе прямоугольника, противоположные углы которого находятся в точках (0, 0) и (W, Н).


Входные данные
Входной файл INPUT.TXT содержит два натуральных числа W и Н, не превосходящих 1000.


Выходные данные
В выходной файл OUTPUT.TXT выведите ответ на задачу.


Примеры:
---------------------------------
|№ |  INPUT.TXT  |  OUTPUT.TXT  |
|-------------------------------|
|1 |1 1          |1             |
|2 |2 1          |3             |
|3 |2 2          |9             |
---------------------------------



Решение.
Принцип такого: выбираем любые два отрезка [x1; x2] и [y1; y2] на осях OX и OY соответственно,
где 0≤x1≤W, 0≤x2≥W, 0≤y1≥H, 0≤y2≥H, x1≠x2, y1≠y2.
Эти отрезки составляют две разных сторон прямоугольника.
Количество точек на отрезке [0; W] равен W+1, а на [0; Y] – Y+1.
Количество способов выбрать k разных точек из n находится по формуле сочеиания:
C(n, k) = n! / ((n-k)! * k!).

Ответ: C(W+1, 2) * C(H+1, 2) = W*H*(W+1)*(H+1)/4


*/

import java.util.Scanner;

public class acmp_282 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long W = in.nextLong();
        int H = in.nextInt();
        System.out.print(W*H*(W+1)*(H+1)/4);
    }
}

