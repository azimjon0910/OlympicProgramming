package acmp;

/* acmp.ru   |   Задание №381
		Lines
(Время: 1 сек. Память: 16 Мб Сложность: 43%)
В таблице из N строк и N столбцов некоторые клетки заняты шариками, другие свободны. Выбран шарик, который нужно переместить, и место, куда его нужно переместить. Выбранный шарик за один шаг перемещается в соседнюю по горизонтали или вертикали свободную клетку. Требуется выяснить, возможно ли переместить шарик из начальной клетки в заданную, и, если возможно, то найти путь из наименьшего количества шагов.

Входные данные
В первой строке входного файла INPUT.TXT находится число N, в следующих N строках - по N символов. Символом точки обозначена свободная клетка, английской заглавной O - шарик, @ - исходное положение шарика, который должен двигаться, английской заглавной X - конечное положение шарика. (2 ≤ N ≤ 40)

Выходные данные
В выходной файл OUTPUT.TXT выведите в первой строке Yes, если движение возможно, или No, если нет. Если движение возможно, то далее следует вывести N строк по N символов - как и на вводе, но букву X, а также все точки по пути следует заменить плюсами. Если решений несколько, выведите любое.

Пример:
----------------------------------------------
|№ |     INPUT.TXT      |     OUTPUT.TXT     |
|--|--------------------|--------------------|
|--|--------------------|--------------------|
|  |5                   |Yes                 |
|  | ....X              | +++++              |
|  | .OOOO              | +OOOO              |
|1 | .....              | +++++              |
|  | OOOO.              | OOOO+              |
|  | @....              | @++++              |
|--|--------------------|--------------------|
|  |5                   |No                  |
|  | ..X..              |                    |
|  | .....              |                    |
|2 | OOOOO              |                    |
|  | .....              |                    |
|  | ..@..              |                    |
|--|--------------------|--------------------|
----------------------------------------------



Решение.

*/


import java.util.Scanner;

public class acmp_381 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("");
	}
}