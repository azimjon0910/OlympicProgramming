package acmp;

/* acmp.ru   |   Задание №129
		Табличка
(Время: 0,5 сек. Память: 16 Мб Сложность: 51%)
Вам дана табличка, состоящая из N строк и M столбцов. В каждой клетке таблицы стоит либо 0, либо 1. Расстоянием между клетками (x1,y1) и (x2,y2) называется |x1-x2|+|y1-y2|. Вам нужно построить другую таблицу, в которой в каждой клетке стоит расстояние от данной до ближайшей клетки, содержащей 1 (в начальной таблице). Гарантируется, что хотя бы одна 1 в таблице есть.

Входные данные
В первой строке входного файла INPUT.TXT содержатся два натуральных числа, не превосходящих 100 - N и M. Далее идут N строк по M чисел - элементы таблицы.

Выходные данные
Выходной файл OUTPUT.TXT должен содержать N строк по M чисел - элементы искомой таблицы.

Пример:
----------------------------------------------
|№ |     INPUT.TXT      |     OUTPUT.TXT     |
|--|--------------------|--------------------|
|--|--------------------|--------------------|
|  |2 3                 |1 1 0               |
|1 | 0 0 1              | 0 1 1              |
|  | 1 0 0              |                    |
|--|--------------------|--------------------|
----------------------------------------------



Решение.

*/


import java.util.Scanner;

public class acmp_129 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("");
	}
}