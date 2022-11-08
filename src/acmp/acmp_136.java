package acmp;

/* acmp.ru   |   Задание №136
		Алгоритм Флойда - 2
(Время: 1 сек. Память: 16 Мб Сложность: 39%)
Дан ориентированный взвешенный граф. Вам необходимо найти пару вершин, кратчайшее расстояние от одной из которых до другой максимально среди всех пар вершин.

Входные данные
В первой строке входного файла INPUT.TXT записано единственное число N (1 ≤ N ≤ 100) - количество вершин графа. В следующих N строках по N чисел - матрица смежности графа, где -1 означает отсутствие ребра между вершинами, а любое неотрицательное число - присутствие ребра данного веса. Элементы матрицы - целые числа от -1 до 100. На главной диагонали матрицы - всегда нули. Гарантируется, что в графе есть хотя бы одно ребро.

Выходные данные
В выходной файл OUTPUT.TXT требуется вывести искомое максимальное кратчайшее расстояние.

Пример:
----------------------------------------------
|№ |     INPUT.TXT      |     OUTPUT.TXT     |
|--|--------------------|--------------------|
|--|--------------------|--------------------|
|  |4                   |16                  |
|  | 0 5 9 -1           |                    |
|1 | -1 0 2 8           |                    |
|  | -1 -1 0 7          |                    |
|  | 4 -1 -1 0          |                    |
|--|--------------------|--------------------|
----------------------------------------------



Решение.

*/


import java.util.Scanner;

public class acmp_136 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("");
	}
}