package acmp;

/* acmp.ru   |   Задание №230
		Луч света в темном царстве
(Время: 1 сек. Память: 16 Мб Сложность: 63%)
Темное царство представляет собой лабиринт N&times;M, некоторые клетки которого окружены зеркальными стенами, а остальные — пустые. Весь лабиринт также окружен зеркальной стеной. В одной из пустых клеток лабиринта поставили светофор, который испускает лучи в 4 направлениях: под 45 градусов относительно стен лабиринта. Требуется изобразить траекторию этих лучей.

Когда луч приходит в угол, через который проходят зеркальные стены, дальше он идет так, как показано на рисунках (серым цветом показаны клетки, которые окружены зеркальными стенами). Аналогичным образом луч ведет себя, когда приходит на границу лабиринта.

Пример:
----------------------------------------------
|№ |     INPUT.TXT      |     OUTPUT.TXT     |
|--|--------------------|--------------------|
|--|--------------------|--------------------|
|  |5 6                 |./*./\              |
|  | ..*...             | /..X./             |
|  | ......             | \./.X*             |
|1 | .....*             | *X.//*             |
|  | *X...*             | /\X/*.             |
|  | ....*.             |                    |
|--|--------------------|--------------------|
|  |3 3                 |\./                 |
|  | ...                | .X.                |
|2 | .X.                | /.\                |
|  | ...                |                    |
|--|--------------------|--------------------|
----------------------------------------------



Решение.

*/


import java.util.Scanner;

public class acmp_230 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("");
	}
}