package acmp;

/* acmp.ru   |   Задание №176
		Скобочки
(Время: 1 сек. Память: 16 Мб Сложность: 69%)
Строка, состоящая из символов «(» и «)», называется скобочной последовательностью. Скобочная последовательность называется правильной, если она может быть получена из некоторого корректного арифметического выражения удалением всех символов, кроме скобок. Например, правильная скобочная последовательность «(())()» может быть получена из выражения «(2-(3+4)*6)*(1+1)».

Глубиной правильной скобочной последовательности называется максимальная разность между количеством открывающихся и закрывающихся скобок в префиксе последовательности (префиксом строки S называется строка, которую можно получить из S удалением некоторого количества последних символов, например, префиксами строки «ABCAB» являются строки «», «A», «AB», «ABC», «ABCA» и «ABCAB»). Например, глубина последовательности «()()(())» равна двум, т.к. префикс «()()((» имеет 4 открывающиеся и 2 закрывающиеся скобки.

Требуется написать программу, определяющую по заданным значениям N и K количество правильных скобочных последовательностей с N открывающимися скобками, которые имеют глубину, равную K.

Входные данные
Входной файл INPUT.TXT содержит в одной строке целые числа N и K (1 ≤ K ≤ N ≤ 50), разделенные пробелом.

Выходные данные
Выходной файл OUTPUT.TXT должен содержать одно число — количество правильных скобочных последовательностей с n открывающимися скобками, которые имеют глубину k.

Пример:
----------------------------------------------
|№ |     INPUT.TXT      |     OUTPUT.TXT     |
|--|--------------------|--------------------|
|1 |3 2                 |3                   |
|2 |37 23               |203685956218528     |
----------------------------------------------



Решение.

*/


import java.util.Scanner;

public class acmp_176 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("");
	}
}