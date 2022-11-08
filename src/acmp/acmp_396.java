package acmp;

/* acmp.ru   |   Задание №396
		Точки и отрезки
(Время: 2 сек. Память: 16 Мб Сложность: 62%)
Дано N отрезков на числовой прямой и M точек на этой же прямой. Для каждой из данных точек определите, скольким отрезкам она принадлежит. Точка x считается принадлежащей отрезку с концами a и b, если выполняется двойное неравенство min(a, b) ≤ x ≤ max(a, b).

Входные данные
Первая строка входного файла INPUT.TXT содержит два целых числа N – число отрезков и M – число точек (1 ≤ N, M ≤ 10^5). В следующих N строках по два целых числа ai и bi – координаты концов соответствующего отрезка. В последней строке M целых чисел – координаты точек. Все числа во входном файле не превосходят по модулю 10^9.

Выходные данные
В выходной файл OUTPUT.TXT выведите M чисел – для каждой точки количество отрезков, в которых она содержится.

Пример:
----------------------------------------------
|№ |     INPUT.TXT      |     OUTPUT.TXT     |
|--|--------------------|--------------------|
|--|--------------------|--------------------|
|  |3 2                 |2 0                 |
|  | 0 5                |                    |
|1 | -3 2               |                    |
|  | 7 10               |                    |
|  | 1 6                |                    |
|--|--------------------|--------------------|
|  |1 3                 |0 0 1               |
|2 | -10 10             |                    |
|  | -100 100 0         |                    |
|--|--------------------|--------------------|
----------------------------------------------



Решение.

*/


import java.util.Scanner;

public class acmp_396 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("");
	}
}