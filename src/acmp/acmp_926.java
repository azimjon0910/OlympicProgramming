package acmp;

/* acmp.ru   |   Задание №926
		Города - 2
(Время: 1 сек. Память: 16 Мб Сложность: 23%)
Юный программист решил придумать собственную игру. Игра происходит на поле размером N &times; N клеток, в некоторых клетках которого расположены города (каждый город занимает одну клетку; в каждой клетке может располагаться не более одного города). Всего должно быть чётное количество городов.

Изначально про каждую клетку игрового поля известно, расположен ли в ней город или нет. Чтобы начать игру, необходимо разделить игровое поле на два государства так, чтобы в каждом государстве было поровну клеток-городов.

Граница между государствами должна проходить по границам клеток таким образом, чтобы из любой клетки каждого государства существовал путь по клеткам этого же государства в любую другую его клетку (из клетки можно перейти в соседнюю, если они имеют общую сторону). Каждая клетка игрового поля должна принадлежать только одному из двух государств, при этом государства не обязаны состоять из одинакового количества клеток.

Требуется написать программу, которая с учетом сказанного разделит клетки заданного игрового поля между двумя государствами.

Входные данные
Первая строка входного файла INPUT.TXT содержит одно натуральное число N, задающее размер игрового поля (N ≤ 50).

Последующие N строк содержат по N заглавных английских букв (без пробелов), кодирующих соответствующие клетки игрового поля: 'C' обозначает клетку, занятую городом, 'D' – пустую клетку. Гарантируется, что на поле есть хотя бы два города и всего их четное число.

Выходные данные
Выходной файл OUTPUT.TXT должен содержать N строк по N цифр (без пробелов) в каждой, кодирующих соответствующие клетки. Цифра 1 обозначает, что данная клетка принадлежит первому государству, цифра 2 – данная клетка принадлежит второму государству. Если решений несколько, необходимо вывести любое из них.

Пример:
----------------------------------------------
|№ |     INPUT.TXT      |     OUTPUT.TXT     |
|--|--------------------|--------------------|
|--|--------------------|--------------------|
|  |3                   |222                 |
|  | DDD                | 212                |
|1 | DDC                | 211                |
|  | DDC                |                    |
|--|--------------------|--------------------|
|  |5                   |11111               |
|  | DDDDD              | 12221              |
|  | CDCDC              | 12221              |
|2 | DCCDC              | 11111              |
|  | DDDDD              | 11111              |
|  | DDDDD              |                    |
|--|--------------------|--------------------|
----------------------------------------------



Решение.

*/


import java.util.Scanner;

public class acmp_926 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("");
	}
}