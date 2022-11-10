package acmp;

/* acmp.ru   |   Задание №304
		Волейбол - 2
(Время: 1 сек. Память: 16 Мб Сложность: 68%)
Партия в волейболе, выигрывается командой, которая первой набирает 25 очков с преимуществом минимум в два очка. В случае равного счета 24-24, игра продолжается до достижения преимущества в 2 очка (26-24; 27-25). Исключение составляет лишь пятая партия (когда счет по партиям 2:2), в этом случае счет ведется по такому же принципу, но до 15 очков, а в случае счета 14:14 игра продолжается так же до достижения преимущества в 2 очка.

Две сыгранные партии, закончившиеся с одинаковым счетом, будем считать разными, если строки, в которые вписан порядок набора очков командами, не равны.

Комитет по проведению соревнований по волейболу заинтересовало, сколько различных партий может быть, заканчивающихся со счетом 25:23, оказывается 16123801841550, далее им стало интересно, сколько же существует различных матчей в которых первая команда победила в 3 партиях со счетом 25:23 25:20 25:18, оказывается 10043105786927107686166271970998925000.

Определить, сколько существует различных матчей, заканчивающихся заданным счетом. Два матча закончившиеся одинаковым количеством партий с одинаковым счетом, считаются различными, если есть различно сыгранные партии.

Входные данные
Во входном файле INPUT.TXT сначала записано число N - количество партий в матче. Далее следует N пар чисел, описывающих счет в каждой партии. При этом результаты партий разделяются пробелом, а счет в каждой партии отделяется двоеточием. Гарантируется, что счет в каждой партии соответствует возможному, согласно правилам волейбола, и ни в какой партии, ни одна из команд не набирает более 40 очков.

Выходные данные
В выходной файл OUTPUT.TXT выведите количество различных матчей, которые могут оканчиваться данным счетом.

Пример:
----------------------------------------------
|№ |     INPUT.TXT      |     OUTPUT.TXT     |
|--|--------------------|--------------------|
|1 |3 25:23 25:20 25:18 |10043105786927107686166271970998925000|
|2 |4 25:23 20:25 26:24 25:18|323866095164273521651645790930981230216140667500000|
----------------------------------------------



Решение.

*/


import java.util.Scanner;

public class acmp_304 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("");
	}
}