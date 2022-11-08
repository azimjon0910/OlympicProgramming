package acmp;

/* acmp.ru   |   Задание №256
		Гексагон
(Время: 1 сек. Память: 16 Мб Сложность: 38%)
<img src="/asp/article/image.asp?id=246" align="right" hspace="10" vspace="10"> Поле для игры в новую игру "Гексагон" разбито на шестиугольники (см. рисунок). Игрок, стартуя из некоторого начального шестиугольника, сделал несколько ходов. Каждый ход заключается в перемещении фишки в соседний шестиугольник (имеющий с тем, где находилась фишка до начала хода, общую сторону) — тем самым, ход делается вдоль одного из направлений X, Y или Z (см. рисунок). Игрок записал все свои ходы, причем если фишка двигалась вдоль какого-либо направления несколько раз подряд, то в записи это обозначается указанием направления и количества ходов, которые были сделаны.

Напишите программу, которая найдет кратчайший (по количеству совершаемых ходов) путь в начальную клетку из той, где фишка оказалась после ходов игрока.

Входные данные
В первой строке входного файла INPUT.TXT записано число N — количество строк в записи перемещений фишки (1 ≤ N ≤ 100). Далее идет N строк с записью ходов: в каждой строке записана сначала большая буква X, Y или Z, задающая направление, затем пробел, и число, задающее количество ходов в данном направлении (число может быть и отрицательным, если игрок перемещал фишку параллельно оси, но в направлении, противоположном направлению оси). Все числа по модулю не превышают 200.

Выходные данные
В выходной файл OUTPUT.TXT выведите длину кратчайшего пути обратно в начальную клетку.

Пример:
----------------------------------------------
|№ |     INPUT.TXT      |     OUTPUT.TXT     |
|--|--------------------|--------------------|
|--|--------------------|--------------------|
|  |4                   |4                   |
|  |Z -2                |                    |
|1 |Y 3                 |                    |
|  |Z 3                 |                    |
|  |X -1                |                    |
|--|--------------------|--------------------|
----------------------------------------------



Решение.

*/


import java.util.Scanner;

public class acmp_256 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("");
	}
}