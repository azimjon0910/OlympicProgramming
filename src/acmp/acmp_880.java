package acmp;

/* acmp.ru   |   Задание №880
		Покрытие
(Время: 2 сек. Память: 32 Мб Сложность: 74%)
Представим себе комнату размера m&times;n, пол которой расчерчен линиями сетки на квадраты 1&times;1. Предлагается покрыть пол этой комнаты дощечками весьма необычного вида.

Одна дощечка представляет собой фигуру, состоящую ровно из 6 клеток квадрата 3&times;3 и являющуюся связной по стороне (иными словами, из любой клетки можно попасть в любую другую, перемещаясь между центрами соседних клеток только по вертикали и горизонтали и не покидая пределов фигуры). Все дощечки одинаковы. Дощечки выкладываются на пол так, чтобы стороны их клеток совмещались с линиями сетки на полу; их нельзя ни поворачивать, ни перевернуть и положить обратной стороной вверх.

Покрытием назовем такое положение дощечек, что каждая клетка пола покрыта хотя бы одной дощечкой из этого набора. Покрытие клетки пола более чем одной дощечкой, равно как и покрытие клеток вне пределов комнаты, допускается.

Требуется узнать, какое минимальное количество дощечек данного вида потребуется, чтобы построить покрытие пола нашей комнаты.

Входные данные
В первой строке входного файла INPUT.TXT заданы через пробел два целых числа m и n (1 ≤ m, n ≤ 9). В следующих трех строках описан квадрат 3&times;3, содержащий дощечку. Каждая из этих строк содержит ровно три символа. Символ «X» (икс большое) соответствует клетке дощечки, а символ «.» (точка) – пустой клетке. Гарантируется, что эти строки не содержат других символов, суммарное количество символов «X» на них равно шести, и фигура из букв «X» связна по стороне.

Выходные данные
В выходной файл OUTPUT.TXT выведите минимальное количество дощечек данного вида, которые нам потребуются, чтобы построить покрытие пола.

Пример:
----------------------------------------------
|№ |     INPUT.TXT      |     OUTPUT.TXT     |
|--|--------------------|--------------------|
|--|--------------------|--------------------|
|  |3 3                 |3                   |
|  | .X.                |                    |
|1 | XXX                |                    |
|  |XX.                 |                    |
|--|--------------------|--------------------|
|  |3 2                 |1                   |
|  | XXX                |                    |
|2 | XXX                |                    |
|  |...                 |                    |
|--|--------------------|--------------------|
|  |2 3                 |2                   |
|  | XXX                |                    |
|3 | XXX                |                    |
|  | ...                |                    |
|--|--------------------|--------------------|
|  |2 2                 |2                   |
|  | XXX                |                    |
|4 | X.X                |                    |
|  | ..X                |                    |
|--|--------------------|--------------------|
----------------------------------------------



Решение.

*/


import java.util.Scanner;

public class acmp_880 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("");
	}
}