package acmp;

/* acmp.ru   |   Задание №583
		Рисование
(Время: 1 сек. Память: 16 Мб Сложность: 65%)
При обучении школьников младших классов программированию часто используется язык «Лого», позволяющий рисовать на экране картинки хвостом виртуальной черепашки.

Рассмотрим упрощенную версию этого языка, в которой разрешается подавать черепашке следующие команды: переместиться вперед на некоторое количество сантиметров, рисуя за собой линию, повернуть налево на 90 градусов и повернуть направо на 90 градусов.

Рассмотрим замкнутую фигуру, нарисованную таким образом. Требуется проверить, верно ли, что любой вертикальный и любой горизонтальный отрезок, соединяющий две точки фигуры, полностью содержится внутри этой фигуры.

Входные данные
Первая строка входного файла INPUT.TXT содержит число n - количество команд черепашки, использованных для рисования фигуры (7 ≤ n ≤ 40 000). Следующие n строк содержат команды. Команды задаются следующим образом:

Пример:
----------------------------------------------
|№ |     INPUT.TXT      |     OUTPUT.TXT     |
|--|--------------------|--------------------|
|--|--------------------|--------------------|
|  |11                  |TRUE                |
|  | f 1                |                    |
|  | r                  |                    |
|  | f 2                |                    |
|  | r                  |                    |
|  | f 2                |                    |
|1 | r                  |                    |
|  | f 1                |                    |
|  | r                  |                    |
|  | f 1                |                    |
|  | l                  |                    |
|  | f 1                |                    |
|--|--------------------|--------------------|
----------------------------------------------



Решение.

*/


import java.util.Scanner;

public class acmp_583 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("");
	}
}