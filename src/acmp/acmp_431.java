package acmp;

/* acmp.ru   |   Задание №431
		Путь коня
(Время: 1 сек. Память: 16 Мб Сложность: 44%)
Дана шахматная доска, состоящая из N&times;N клеток, несколько из них вырезано. Провести ходом коня через невырезанные клетки путь минимальной длины из одной заданной клетки в другую.

Входные данные
В первой строке входного файла INPUT.TXT задано число N (2 ≤ N ≤ 50). В следующих N строках содержится по N символов. Символом # обозначена вырезанная клетка, точкой - невырезанная клетка, @ - заданные клетки (таких символов два), соответствующие началу и концу пути коня.

Выходные данные
Если путь построить невозможно, в выходной файл OUTPUT.TXT следует вывести "Impossible", в противном случае вывести такую же карту, как и на входе, но пометить все промежуточные положения коня символом @.

Пример:
----------------------------------------------
|№ |     INPUT.TXT      |     OUTPUT.TXT     |
|--|--------------------|--------------------|
|--|--------------------|--------------------|
|  |5                   |...@.               |
|  | .....              | .@@..              |
|  | .@@..              | ....@              |
|1 | .....              | .....              |
|  | .....              | .....              |
|  | .....              |                    |
|--|--------------------|--------------------|
|  |5                   |@..@.               |
|  | @..@.              | ..##.              |
|  | ..##.              | .@..@              |
|2 | .....              | ..@..              |
|  | .....              | @....              |
|  | .....              |                    |
|--|--------------------|--------------------|
|  |5                   |Impossible          |
|  | @....              |                    |
|  | ..#..              |                    |
|3 | .#...              |                    |
|  | .....              |                    |
|  | ....@              |                    |
|--|--------------------|--------------------|
----------------------------------------------



Решение.

*/


import java.util.Scanner;

public class acmp_431 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("");
	}
}