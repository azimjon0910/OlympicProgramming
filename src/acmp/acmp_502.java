package acmp;

/* acmp.ru   |   Задание №502
		Лягушонок
(Время: 1 сек. Память: 16 Мб Сложность: 39%)
Многие, вероятно, слышали песни про приключения лягушонка Crazy Frog. На этот раз неугомонное милое создание решило подкрепиться, но даже такое простое действие решило выполнить в виде игры. Итак, в каждой клетке квадратного игрового поля, разбитого на N&times;N (N ≤ 50) клеток, находится один комар весом aij (вес комара – натуральное число ≤ 50), i - номер строки, j - номер столбца. Лягушонок, прыгая с клетки на клетку, ест комаров. Правила игры таковы - в каждом столбце можно съесть не более одного комара. Всякий раз при съедании комара запоминаем номер строки, откуда съеден комар, и сумма номеров строк, в которых были съедены комары, в конце игры должна быть в точности равна N. Учтите, если из какой-то строки съедено несколько комаров, то номер данной строки участвует в суммировании более одного раза.

Определите максимальный вес комаров, который можно съесть при следовании приведённым правилам.

Входные данные
Первая строка входного файла INPUT.TXT содержит число N. Следующие N строк содержат по N чисел aij, разделенных пробелами.

Выходные данные
В выходной файл OUTPUT.TXT выведите целое число – вес съеденных комаров.

Пример:
----------------------------------------------
|№ |     INPUT.TXT      |     OUTPUT.TXT     |
|--|--------------------|--------------------|
|--|--------------------|--------------------|
|  |3                   |14                  |
|  |8 2 1               |                    |
|1 |1 2 6               |                    |
|  |2 7 2               |                    |
|--|--------------------|--------------------|
|  |5                   |19                  |
|  | 8 2 1 2 3          |                    |
|  | 1 2 6 2 4          |                    |
|2 | 2 7 2 3 4          |                    |
|  | 1 3 2 4 4          |                    |
|  | 1 3 4 3 1          |                    |
|--|--------------------|--------------------|
----------------------------------------------



Решение.

*/


import java.util.Scanner;

public class acmp_502 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("");
	}
}