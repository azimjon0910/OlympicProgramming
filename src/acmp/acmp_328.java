package acmp;

/* acmp.ru   |   Задание №328
    Точки на костях Домино
(Время: 1 сек. Память: 16 Мб Сложность: 25%)

Для того, чтобы заработать огромный капитал, новым русским необходимо иметь неординарное мышление. Конечно, при такой сложной работе, должны так же присутствовать какие-то особенные механизмы для отдыха и развлечений. В этих целях в казино был придуман специальный набор домино для новых русских. Обычные кости домино представляют собой набор из различных комбинаций сочетаний двух плиток, на каждой из которых отображается от 0 до 6 точек. А этот набор представляет собой подобные сочетания плиток, но количество точек на каждой может быть от нуля до заданного значения, которое зависит от интеллектуального уровня игроков. В таком наборе костей присутствуют всевозможные сочетания плиток, но при этом ни одна из костей не повторяется (даже такие комбинации как 2-5 и 5-2 считаются одинаковыми).
Для изготовления данного набора костей перед изготовителем встала проблема вычисления суммарного количества точек на всех костях домино. Это связано с тем, что домино для новых русских украшается бриллиантами, которые представляют собой точки на плитках и при изготовлении необходимо оценить стоимость.
Помогите написать программу, которая решит эту задачу.

Входные данные
Входной файл INPUT.TXT содержит одно натуральное число N – максимальное количество точек на одной плитке домино. (N ≤ 10000)

Выходные данные
В выходной файл OUTPUT.TXT выведите количество бриллиантовых камней, которые необходимо изготовить для заданного набора костей.

Пример:
---------------------------------
|№ |  INPUT.TXT  |  OUTPUT.TXT  |
|-------------------------------|
|1 |2            |12            |
---------------------------------


Решение.
Рассмотрим пример, где n = 3.
00
01
02
03
11
12
13
22
23
33
Первая цифра эта цифра в одной стороны кости домино, вторая – в обратной стороны. В домино нет ориентации, то есть, например кость со сторонами n и m и кость со сторонами m и n считаются одна и та же кость.
Цифр всего n+1 – с 0 до n. На примере видно, что каждая цифра встречается n+2 раза: n раз со всеми остальными цифрами и еще 2 раза, когда сама с собой. Получается надо найти следующую сумму:
(n+2)*0 + (n+2)*1 + (n+2)*2 + … + (n+2)*n.
Вынесем (n+2) за скобки: (n+2)*(1+…+n). Видем сумму арифметической прогрессии от 1 до n, где aₙ=n. Она находится по следующей формуле (a₁+aₙ)*n/2. И так, ответ: (n+2)*(1+n)*n/2.

*/

import java.util.Scanner;

public class acmp_328 {
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      long n = in.nextLong();
      System.out.print((n + 2) * (1 + n) * n / 2);
    }
}