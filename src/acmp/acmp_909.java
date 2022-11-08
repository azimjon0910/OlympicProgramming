package acmp;

/* acmp.ru   |   Задание №909
		Морской бой - 3
(Время: 2 сек. Память: 32 Мб Сложность: 50%)
Всем известна увлекательная игра «Морской бой». Сейчас играть в морской бой можно не только с соседом по парте, но и с компьютером. Игра c компьютером ведется на прямоугольном поле произвольных размеров N&times;M, где N - количество строк, M - количество столбцов. Приближается чемпионат Мира по морскому бою. Планируется вести его трансляцию в режиме реального времени: демонстрировать карту с кораблями и выводить статистику: количество целых, подбитых и уничтоженных кораблей, находящихся на поле. Требуется написать программу для подсчета статистики.

Корабль на поле — это связанная фигура, стоящая из одной или нескольких рядом лежащих клеток, имеющих общую сторону. Корабли могут быть абсолютно любых форм и размеров!

Входные данные
Первая строка входного файла INPUT.TXT содержит два целых числа N и M (1≤ N,M ≤ 10^3), разделённых пробелами - размеры игрового поля. Далее идут N строк по M символов - описание игрового поля.

Английская буква 'X' обозначает подбитую клетку корабля, 'S' - не подбитую клетку корабля, '-' – свободное водное пространство.

Выходные данные
В выходной файл OUTPUT.TXT выведите через пробел три числа:

Пример:
----------------------------------------------
|№ |     INPUT.TXT      |     OUTPUT.TXT     |
|--|--------------------|--------------------|
|--|--------------------|--------------------|
|  |3 8                 |2 1 1               |
|  | ---SSS--           |                    |
|1 | XX--S-X-           |                    |
|  | X-S---S-           |                    |
|  |                    |                    |
|--|--------------------|--------------------|
----------------------------------------------



Решение.

*/


import java.util.Scanner;

public class acmp_909 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("");
	}
}