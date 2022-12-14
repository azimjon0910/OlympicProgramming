package acmp;

/* acmp.ru   |   Задание №234
		Сапер
(Время: 1 сек. Память: 16 Мб Сложность: 28%)
Мальчику Васе очень нравится известная игра "Сапер" ("Minesweeper").

В "Сапер" играет один человек. Игра идет на клетчатом поле (далее будем называть его картой) N&times;M (N строк, M столбцов). В K клетках поля стоят мины, в остальных клетках записано либо число от 1 до 8 — количество мин в соседних клетках, либо ничего не написано, если в соседних клетках мин нет. Клетки являются соседними, если они имеют хотя бы одну общую точку, в одной клетке не может стоять более одной мины. Изначально все клетки поля закрыты. Игрок за один ход может открыть какую-нибудь клетку. Если в открытой им клетке оказывается мина — он проигрывает, иначе игроку показывается число, которое стоит в этой клетке, и игра продолжается. Цель игры — открыть все клетки, в которых нет мин.

У Васи на компьютере есть эта игра, но ему кажется, что все карты, которые в ней есть, некрасивые и неинтересные. Поэтому он решил нарисовать свои. Однако фантазия у него богатая, а времени мало, и он хочет успеть нарисовать как можно больше карт. Поэтому он просто выбирает N, M и K и расставляет мины на поле, после чего все остальные клетки могут быть однозначно определены. Однако на определение остальных клеток он не хочет тратить свое драгоценное время. Помогите ему!

По заданным N, M, K и координатам мин восстановите полную карту.

Входные данные
В первой строке входного файла INPUT.TXT содержатся числа N, M и K (1 ≤ N ≤ 200, 1 ≤ M ≤ 200, 0 ≤ K ≤ N&times;M). Далее идут K строк, в каждой из которых содержится по два числа, задающих координаты мин. Первое число в каждой строке задает номер строки клетки, где находится мина, второе число — номер столбца. Левая верхняя клетка поля имеет координаты (1,1), правая нижняя — координаты (N,M).

Выходные данные
Выходной файл OUTPUT.TXT должен содержать N строк по M символов — соответствующие строки карты. j-й символ i-й строки должен содержать символ ‘*‘ (звездочка) если в клетке (i,j) стоит мина, цифру от 1 до 8, если в этой клетке стоит соответствующее число, либо ‘.‘ (точка), если клетка (i,j) пустая.

Пример:
----------------------------------------------
|№ |     INPUT.TXT      |     OUTPUT.TXT     |
|--|--------------------|--------------------|
|--|--------------------|--------------------|
|  |10 9 23             |.111..1*1           |
|  | 1 8                | 13*2..111          |
|  | 2 3                | 1**3.....          |
|  |3 2                 | 13*2.111.          |
|  |3 3                 | .111.2*2.          |
|  |4 3                 | 233335*41          |
|  |5 7                 | ********1          |
|  | 6 7                | *6*7*8*41          |
|  |7 1                 | 13*4***2.          |
|  |7 2                 | .1122321.          |
|  |7 3                 |                    |
|  |7 4                 |                    |
|1 |7 5                 |                    |
|  | 7 6                |                    |
|  |7 7                 |                    |
|  |7 8                 |                    |
|  |8 1                 |                    |
|  |8 3                 |                    |
|  |8 5                 |                    |
|  | 8 7                |                    |
|  |9 3                 |                    |
|  |9 5                 |                    |
|  |9 6                 |                    |
|  |9 7                 |                    |
|--|--------------------|--------------------|
----------------------------------------------



Решение.

*/


import java.util.Scanner;

public class acmp_234 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("");
	}
}