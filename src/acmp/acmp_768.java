package acmp;

/* acmp.ru   |   Задание №768
		Звездные прямоугольники
(Время: 1 сек. Память: 16 Мб Сложность: 35%)
Астроном Костя очень любит разглядывать звездное небо в телескоп. Однажды, глядя на звезды, он задумался: а сколько различных звездных прямоугольников видно на небе? Звездный прямоугольник – это четыре различных звезды, которые при соединении четырьмя прямыми линиями образуют прямоугольник.

Два звездных прямоугольника считаются различными, если хотя бы одна звезда из набора звезд, их формирующих отличается.

Помогите Косте сосчитать количество различных звездных прямоугольников.

Входные данные
Входной файл INPUT.TXT содержит число N (1 ≤ N ≤ 100) – количество звезд. Следующие N строк содержат координаты звезд (X, Y), разделенные пробелом. Координаты представлены целыми числами (0 ≤ X, Y ≤ 10^5).

Выходные данные
В выходной файл OUTPUT.TXT выведите количество различных прямоугольников, образующихся звездами.

Пример:
----------------------------------------------
|№ |     INPUT.TXT      |     OUTPUT.TXT     |
|--|--------------------|--------------------|
|--|--------------------|--------------------|
|  |4                   |1                   |
|  |1 1                 |                    |
|1 |10 10               |                    |
|  |1 10                |                    |
|  |10 1                |                    |
|--|--------------------|--------------------|
|  |4                   |0                   |
|  |1 1                 |                    |
|2 |2 10                |                    |
|  |9 10                |                    |
|  |10 1                |                    |
|--|--------------------|--------------------|
----------------------------------------------



Решение.

*/


import java.util.Scanner;

public class acmp_768 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("");
	}
}