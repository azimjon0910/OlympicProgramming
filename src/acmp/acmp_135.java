package acmp;

/* acmp.ru   |   Задание №135
		Алгоритм Флойда
(Время: 1 сек. Память: 16 Мб Сложность: 36%)
Полный ориентированный взвешенный граф задан матрицей смежности. Постройте матрицу кратчайших путей между его вершинами. Гарантируется, что в графе нет циклов отрицательного веса.

Входные данные
В первой строке входного файла INPUT.TXT записано единственное число N (1 ≤ N ≤ 100) - количество вершин графа. В следующих N строках по N чисел - матрица смежности графа (j-ое число в i-ой строке соответствует весу ребра из вершины i в вершину j). Все числа по модулю не превышают 100. На главной диагонали матрицы - всегда нули.

Выходные данные
В выходной файл OUTPUT.TXT выведите N строк по N чисел - матрицу кратчайших расстояний между парами вершин. j-ое число в i-ой строке должно быть равно весу кратчайшего пути из вершины i в вершину j.

Пример:
----------------------------------------------
|№ |     INPUT.TXT      |     OUTPUT.TXT     |
|--|--------------------|--------------------|
|--|--------------------|--------------------|
|  |4                   |0 5 7 13            |
|  | 0 5 9 100          | 12 0 2 8           |
|1 | 100 0 2 8          | 11 16 0 7          |
|  | 100 100 0 7        | 4 9 11 0           |
|  | 4 100 100 0        |                    |
|--|--------------------|--------------------|
----------------------------------------------



Решение.

*/


import java.util.Scanner;

public class acmp_135 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("");
	}
}